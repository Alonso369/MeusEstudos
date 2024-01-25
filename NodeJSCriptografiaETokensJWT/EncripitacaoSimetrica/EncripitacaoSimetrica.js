import { createCipheriv, randomBytes, createDecipheriv } from 'crypto';

const mensagem = 'Demonstracao do curso';
// chave que eu vou gerar
const chave = randomBytes(32);
// apêndice da chave, para criar uma quantidade maior de variação
const vi = randomBytes(16);

const cifra = createCipheriv('aes256', chave, vi);
// cifrar a mesnagem
const mensagemCifrada = cifra.update(mensagem, 'utf-8', 'hex') + cifra.final('hex');
console.log(mensagemCifrada);

// Transmissão  ------------------ chave, vi (vetor de incializaçaõ), mesangem
//Decifrar a mensagem
const decifra = createDecipheriv('aes256', chave, vi);

const mensagemDecifrada = decifra.update(mensagemCifrada, 'hex', 'utf-8') + decifra.final('utf-8');

console.log(`Decifrado: ${mensagemDecifrada.toString('utf-8')}`);
