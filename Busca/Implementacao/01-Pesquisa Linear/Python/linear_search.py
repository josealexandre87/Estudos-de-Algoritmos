
# Pesquisa Linear (Linear Search)

def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i ## Retorna o índice caso o elemento seja encontrado
    return -1 ## Retorna -1 se elemento não for encontrado

#Exemplo de Execução
arr = [10, 20, 30, 40, 50]
target = 30
result = linear_search(arr, target)
print(f"Elemento encontrado no índice: {result}" if result != -1 else "Elemento não encontrado")