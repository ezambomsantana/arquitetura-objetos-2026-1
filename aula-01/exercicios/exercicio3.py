class Livro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.disponivel = True

    def emprestar(self):
        if self.disponivel:
            self.disponivel = False
            print(f"O livro '{self.titulo}' foi emprestado.")
        else:
            print("Livro já está emprestado.")

    def devolver(self):
        self.disponivel = True
        print(f"O livro '{self.titulo}' foi devolvido.")

    def status(self):
        estado = "Disponível" if self.disponivel else "Emprestado"
        print(f"{self.titulo} - {estado}")


biblioteca = []

while True:
    titulo = input("Título do livro (ou 'sair'): ")
    if titulo.lower() == "sair":
        break

    autor = input("Autor: ")
    livro = Livro(titulo, autor)
    biblioteca.append(livro)

print("\nSimulando empréstimos...\n")

for livro in biblioteca:
    livro.status()
    livro.emprestar()
    livro.status()
