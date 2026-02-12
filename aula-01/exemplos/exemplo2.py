alunos = []

while True:
    nome = input("Nome do aluno (ou 'sair'): ")
    if nome.lower() == "sair":
        break

    idade = int(input("Idade: "))
    nota = float(input("Nota final: "))

    aluno = {
        "nome": nome,
        "idade": idade,
        "nota": nota
    }

    alunos.append(aluno)

# Ordenar por nota decrescente
alunos.sort(key=lambda x: x["nota"], reverse=True)

print("\nRanking de alunos:")
for aluno in alunos:
    print(f"{aluno['nome']} - Nota: {aluno['nota']}")

# Calcular média geral
media = sum(a["nota"] for a in alunos) / len(alunos)
print(f"\nMédia geral da turma: {media:.2f}")
