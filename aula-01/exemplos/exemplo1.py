def calcular_media(notas):
    soma = 0
    for nota in notas:
        soma += nota
    return soma / len(notas)


quantidade = int(input("Quantas notas deseja inserir? "))

notas = []
contador = 0

while contador < quantidade:
    nota = float(input(f"Digite a nota {contador + 1}: "))
    notas.append(nota)
    contador += 1

media = calcular_media(notas)

print(f"Média final: {media:.2f}")

if media >= 7:
    print("Aluno aprovado!")
elif media >= 5:
    print("Aluno em recuperação!")
else:
    print("Aluno reprovado!")
