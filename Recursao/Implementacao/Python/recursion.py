# Recursao (Recursion) - Fatorial Recursivo

def fatorial(n):
    if n == 0 or n == 1:
        return 1
    return n * fatorial(n -1)

# Uso

print(fatorial(5)) # saída 120