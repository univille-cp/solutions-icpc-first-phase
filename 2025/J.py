linha = input()
lista = linha.split(" ")
tarefas_por_nivel = [False,False,False,False]

for e in lista:
    tarefas_por_nivel[int(e) -1] = True
    
tarefas_que_faltam = 4

for feito in tarefas_por_nivel:
    if feito:
        tarefas_que_faltam = tarefas_que_faltam - 1
        

print(tarefas_que_faltam)
