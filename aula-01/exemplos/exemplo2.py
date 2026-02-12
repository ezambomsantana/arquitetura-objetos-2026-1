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

print("\Lista de alunos:")
for aluno in alunos:
    print(f"{aluno['nome']} - Nota: {aluno['nota']}")

media = sum(a["nota"] for a in alunos) / len(alunos)
print(f"\nMédia geral da turma: {media:.2f}")
