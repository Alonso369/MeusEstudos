import { createHash } from 'crypto';

function criaHash(senha) {
    return createHash('sha256').update(senha).digest('hex')
}

console.log(criaHash("uma String qualquer"));

class Usuario {
    constructor(nome, senha) {
        this.nome = nome;
        this.hash = criaHash(senha);
    }

    autentica(nome, senha) {
        if (nome === this.nome && this.hash === criaHash(senha)) {
            console.log("Usuário autenticado com sucesso!");
            return true;
        }

        console.log("Usuário ou senha incorretos!");
        return false;

    }
}

const usuario = new Usuario('Alonso Kraemer', 'minhaSenha');

console.log(usuario);

//Caso de sucesso
usuario.autentica('Alonso Kraemer', 'minhaSenha');

//Caso de errado a autenticacao
usuario.autentica('Alonso Kraemer', 'minhaSenha');