// Pesquisa Binária (Binary Search)

function binary_search(arr, target){
    let left = 0, right = arr.length -1;
    
    while(left <= right){
        let mid = Math.floor((left + right) / 2); // A função Math.floor(x) arredonda para baixo o valor de x, retornando o maior número inteiro menor ou igual a x.

        if(arr[mid] === target){
            return mid;
        } else if(arr[mid] < target){
            left = mid +1;
        } else {
            right = mid -1;
        }
        return -1;
    };
};

// Exemplo de Execução:
let arr = [10, 20, 30, 40, 50, 60, 70];
let target = 40;
result = binary_search(arr, target);
console.log(result !== -1 ? `Elemento encontrado no índice: ${result}` : `Elemento não encontrado`);

