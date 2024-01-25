import { scryptSync, randomBytes, timingSafeEqual } from 'crypto';

function criarHashComSal(senha) {
    const sal = randomBytes(16).toString('hex');
    
    const senhaHasheada = scryptSync(senha, sal, 64).toString('hex');

    return `${sal}:${senhaHasheada}`;
}

class Usuario {
    constructor(nome, senha) {
        this.nome = nome;
        [this.sal, this.hash] = criarHashComSal(senha).split(':');
    }
    autentica(nome, senha) {
        if( nome === this.nome) {
            const testeHash = scryptSync(senha, this.sal, 64);
            const hashReal = Buffer.from(this.hash, 'hex');

            const hashsCorrespondem = timingSafeEqual(testeHash, hashReal);
            
            if (hashsCorrespondem) {
                console.log("Usuário autenticado com suceeso!");
                return true;
            }
        }

        console.log("Usuário ou senha incorretos!");
        return false;
    }
}

const jm = new Usuario('Alonso Kraemer', 'senhaSecreta');

console.log(jm);

//Teste de sucesso
jm.autentica("Alonso Kraemer", "senhaSecreta");

//Testes de Insucesso
jm.autentica("JM", "senhaSecreta");

//Testes de Insucesso
jm.autentica("Alonso Kraemer", "SenhaSecreta");