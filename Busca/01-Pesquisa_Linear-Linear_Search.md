# Algoritmos de Busca

## 📌 1. Pesquisa Linear (Linear Search)

### 📖 Definição:

A pesquisa linear é um algoritmo simples que percorre um array ou lista elemento por elemento até encontrar o valor desejado ou até o fim da lista.

### 🛠️ Complexidade:

Melhor caso: O(1) (quando o elemento está na primeira posição).
Pior caso: O(n) (quando o elemento está no final ou não está na lista).

### 📌 Explicação

1. O algoritmo percorre a lista comparando cada elemento com o valor desejado.
2. Se encontrar o valor, retorna o índice onde ele está.
3. Se não encontrar, retorna -1, indicando que o elemento não está na lista.
4. Funciona bem para listas pequenas, mas é ineficiente para grandes volumes de dados.

---

### 🎯 Exercícios de Fixação

#### Pergunta 1:

<ul>Qual é a complexidade de tempo no pior caso para a Pesquisa Linear?
    <li>(A) O(1)</li>
    <li>(C) O(log n)</li>
    <li>(B) O(n) ✅</li>
    <li>(D) O(n log n)</li>
    <li>(E) O(n²)</li>
</ul>

#### Pergunta 2:
<ul>Se a lista contém n elementos, quantas comparações no máximo podem ser feitas na Pesquisa Linear?
    <li>(A) 1</li>
    <li>(B) n/2</li>
    <li>(C) n ✅</li>
    <li>(D) log n</li>
    <li>(E) n²</li>
</ul>

#### Pergunta 3:
<ul>Em que tipo de lista a Pesquisa Linear é mais eficiente do que a Pesquisa Binária?
    <li>(A) Lista desordenada pequena ✅</li>
    <li>(B) Lista ordenada grande</li>
    <li>(C) Lista ordenada pequena</li>
    <li>(D) Lista com números consecutivos</li>
    <li>(E) Nenhuma das anteriores</li>
</ul>

#### Pergunta 4:
<ul>Qual das opções abaixo não influencia no tempo de execução da Pesquisa Linear?
    <li>(A) Número total de elementos na lista</li>
    <li>(B) Posição do elemento desejado na lista</li>
    <li>(C) Se a lista está ordenada ou não ✅</li>
    <li>(D) Número de comparações feitas</li>
    <li>(E) Tamanho da lista</li>
</ul>

#### Pergunta 5:
<ul>O que acontece se o elemento buscado não estiver na lista?
    <li>(A) Retorna o índice 0</li>
    <li>(B) Retorna -1 ✅</li>
    <li>(C) Retorna None</li>
    <li>(D) Retorna uma exceção</li>
    <li>(E) Continua executando indefinidamente</li>
</ul>

---
---