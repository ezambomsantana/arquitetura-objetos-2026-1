produtos = []

while True:
    nome = input("Nome do produto (ou 'sair'): ")
    if nome.lower() == "sair":
        break

    preco = float(input("Preço: "))
    quantidade = int(input("Quantidade em estoque: "))

    produto = {
        "nome": nome,
        "preco": preco,
        "quantidade": quantidade
    }

    produtos.append(produto)

# Mostrar produtos com estoque baixo (menos de 5)
print("\nProdutos com estoque baixo:")
for p in produtos:
    if p["quantidade"] < 5:
        print(f"{p['nome']} - Estoque: {p['quantidade']}")

# Ordenar por preço crescente
produtos.sort(key=lambda x: x["preco"])

print("\nLista ordenada por preço:")
for p in produtos:
    print(f"{p['nome']} - R$ {p['preco']:.2f}")
