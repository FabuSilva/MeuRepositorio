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
        valor = float(input("Digite o valor do depósito: "))
        if valor > 0:
            saldo += valor
            extrato += f'Depósito de ${valor:.2f} \n'
        else:
            print("Erro")
    elif opcao == "s":
        valor = float(input("Digite o valor do saque: "))
        excedeu_saldo = valor > saldo
        excedeu_limite = valor > limite
        excedeu_saque = numero_saque >= LIMITE_SAQUE 
        if excedeu_saldo:
            print("Excedeu saldo")
        elif excedeu_limite:
            print("Excedeu limite")
        elif excedeu_saque:
            print("Excedeu saques")
        elif valor > 0:
            saldo -= valor
            extrato += f'Saque: ${valor:.2f} \n' 
            numero_saque += 1
    elif opcao == "e":
        print("\n========== EXTRATO ==========")  
        print("Não foram realizadas movimentações" if not extrato else extrato)
        print(f'\nSaldo: ${saldo:.2f}') 
    elif opcao == "q":
        break
    else:
        print("Opção inválida") 