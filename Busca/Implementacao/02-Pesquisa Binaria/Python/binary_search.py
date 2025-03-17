
# Pesquisa Binária (Binary Search)

def binary_search(arr, target):
    left , right = 0, len(arr) -1 # Listas começam com 0 (zero) 0 a 99
    
    while left <= right:
        mid = (left + right) // 2 #Encontra o meio da lista
        if arr[mid] == target:
            return mid  # Retorna o índice do elemento encontrado
        elif arr[mid] < target: #Busca na metade esquerda
            left = mid + 1 #Faz o left ter um novo valor, eliminando a metade direita
        else:
            right = mid -1 #Faz o right ter um novo valor, eliminando a metade esqueda
    return -1

#Exemplo de Execução
arr = [10, 20, 30, 40, 50, 60, 70]
target = 40
result = binary_search(arr, target)
print(f"Elemento encontrado no índice: {result}" if result != -1 else "Elemento não encontrado")