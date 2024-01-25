arquivo_contatos = open('dados/contatos.csv', econding='latin_1')

conteudo = arquivo_contatos.readLines()

print(conteudo)

for linha in conteudo:
    print(linha, end='')