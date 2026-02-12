def mostrar_menu():
    print("\n1 - Ver saldo")
    print("2 - Depositar")
    print("3 - Sacar")
    print("4 - Sair")


saldo = 1000.0

while True:
    mostrar_menu()
    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        print(f"Saldo atual: R$ {saldo:.2f}")

    elif opcao == 2:
        valor = float(input("Valor para depósito: "))
        if valor > 0:
            saldo += valor
            print("Depósito realizado com sucesso!")

    elif opcao == 3:
        valor = float(input("Valor para saque: "))
        if 0 < valor <= saldo:
            saldo -= valor
            print("Saque realizado com sucesso!")
        else:
            print("Saldo insuficiente!")

    elif opcao == 4:
        print("Encerrando sistema...")
        break

    else:
        print("Opção inválida!")
