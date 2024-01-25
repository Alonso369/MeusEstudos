const mensagemSecreta = "alura";

console.log(mensagemSecreta);

function cifraMensagem(mensagem, movimentos) {
    const mensagemCifrada = mensagem.split('').map( caractere => {
        const codigoCaractere = caractere.charCodeAt(0);
        return String.fromCharCode( codigoCaractere + movimentos);
    })

    return mensagemCifrada.join('');
}

const mensagemCifrada = cifraMensagem(mensagemSecreta, 4);

console.log(mensagemCifrada);


function decifraMensagem(mensagem, movimentos) {
    const mensagemCifrada = mensagem.split('').map( caractere => {
        const codigoCaractere = caractere.charCodeAt(0);
        return String.fromCharCode( codigoCaractere - movimentos);
    })

    return mensagemCifrada.join('');
}

const mensagemDecifrada = decifraMensagem(mensagemCifrada, 4);

console.log(mensagemDecifrada);
