linha = input()
lista = linha.split(" ")
N = int(lista[0])
M = int(lista[1])
G = [[0 for _ in range(M)] for _ in range(N)]
for i in range(N):
    linha = input()
    lista = linha.split(" ")
    for j in range(M):
        G[i][j] = int(lista[j])
    
total = 0
for i in range(M):
    maior = -1
    for j in range(N):
        maior = max(maior,G[j][i])
    total = total + maior
    
print(total)
