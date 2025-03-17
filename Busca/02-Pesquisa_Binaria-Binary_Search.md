# Algoritmos de Busca

## 📌 2. Pesquisa Binária (Binary Search)

### 📖 Definição:

A pesquisa binária é um algoritmo de busca eficiente que reduz o espaço de busca pela metade a cada iteração. Ele só funciona em listas ordenadas.

### 🛠️ Complexidade:

- Melhor caso: O(1) (se o elemento está no meio da lista).
- Caso médio e pior caso: O(log n) (porque reduz o tamanho da lista pela metade a cada passo).

### 📌 Explicação

1. O algoritmo divide a lista ao meio e compara o elemento do meio com o valor buscado.
2. Se o valor do meio for igual ao elemento procurado, o algoritmo retorna o índice.
3. Se o valor for menor, a busca continua na metade direita da lista.
4. Se for maior, a busca continua na metade esquerda.
5. Esse processo se repete até encontrar o elemento ou até não haver mais números para buscar.

---

### 🎯 Exercícios de Fixação
#### Pergunta 1:
<ul>Qual a complexidade do algoritmo de Pesquisa Binária no pior caso?
    <li>(A) O(1)</li>
    <li>(B) O(n)</li>
    <li>(C) O(log n) ✅</li>
    <li>(D) O(n log n)</li>
    <li>(E) O(n²)</li>
</ul>

#### Pergunta 2:
<ul>Qual das opções abaixo é um pré-requisito para usar a Pesquisa Binária corretamente?
    <li>(A) A lista precisa estar ordenada ✅</li>
    <li>(B) A lista pode estar em qualquer ordem</li>
    <li>(C) A lista precisa ser circular</li>
    <li>(D) A lista precisa ter um número par de elementos</li>
    <li>(E) A lista precisa ser maior que 1000 </li>elementos</li>
</ul>

#### Pergunta 3:
<ul>Quantas comparações a Pesquisa Binária faz no pior caso para uma lista com 1.000.000 de elementos?
    <li>(A) 10</li>
    <li>(B) 20 ✅ (pois log₂(1.000.000) ≈ 20)</li>
    <li>(C) 500.000</li>
    <li>(D) 1000</li>
    <li>(E) 1000000</li>
</ul>

#### Pergunta 4:
<ul>Se tivermos uma lista ordenada com 10 elementos, qual a quantidade máxima de passos que a Pesquisa Binária fará para encontrar um elemento inexistente?
    <li>(A) 1</li>
    <li>(B) 2</li>
    <li>(C) 3</li>
    <li>(D) 4 ✅ (log₂(10) ≈ 4)</li>
    <li>(E) 10</li>
</ul>

#### Pergunta 5:
<ul>
Se a Pesquisa Binária está sempre reduzindo pela metade o tamanho da busca, o que acontece quando resta apenas um único elemento?
    <li>(A) O algoritmo sempre encontra o número</li>
    <li>(B) O algoritmo pode errar e retornar um índice incorreto</li>
    <li>(C) O algoritmo verifica esse único elemento e retorna o resultado ✅</li>
    <li>(D) O algoritmo continua a dividir indefinidamente</li>
    <li>(E) O algoritmo entra em loop infinito</li>
</ul>

---
---
