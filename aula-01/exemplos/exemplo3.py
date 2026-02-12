class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.titular = titular
        self.saldo = saldo

    def depositar(self, valor):
        if valor > 0:
            self.saldo += valor

    def sacar(self, valor):
        if 0 < valor <= self.saldo:
            self.saldo -= valor
        else:
            print("Saldo insuficiente!")

    def exibir_saldo(self):
        print(f"Titular: {self.titular} | Saldo: R$ {self.saldo:.2f}")


contas = []

while True:
    nome = input("Nome do titular (ou 'sair'): ")
    if nome.lower() == "sair":
        break

    conta = ContaBancaria(nome)
    contas.append(conta)

for conta in contas:
    conta.depositar(1000)
    conta.sacar(250)
    conta.exibir_saldo()
