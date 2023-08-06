menu = """
[d] Depositar.
[s] Sacar.
[e] Extrato.
[q] Sair.

=> """
saldo = 0
limite = 500
extrato = ""
LIMITE_SAQUE = 3
numero_saque = 0

while True:
    opcao = input(menu.lower())
    
    if opcao == "d":
        valor = float(input("Digite o valor do deposito: "))
        if valor > 0:
            saldo+=valor
            extrato += f'Deposito de ${valor:.2f} '
        else:
            print("Error")
    elif opcao == "s":
        valor = float(input("Digite o valor do saque: "))
        exedeu_saldo = valor > saldo
        exedeu_limite = valor > limite
        exedeu_saque = numero_saque >= LIMITE_SAQUE
        if exedeu_saldo:
            print("Exedeu saldo")
        elif exedeu_limite:
            print("Exedeu limite")
        elif exedeu_saque:
            print("Exedeu saque")
        elif valor > 0:
            saldo -= valor
            extrato += f'Saque:${valor:.2f} '
            numero_saque += 1
    elif opcao =="e":
        print("\n==========EXTRATO==========")
        print("Não foram realizadas movimentações" if not extrato else extrato)
        print(f'\nsaldo: ${saldo:.2}')
    elif opcao =="q":
        break
    else:
        print("Opção invalida")
        
    