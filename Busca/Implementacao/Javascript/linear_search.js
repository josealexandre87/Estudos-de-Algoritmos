// Pesquisa Linear (Linear Search)

function linear_search(arr, target){
    for(let i=0; i < arr.length; i++){
        if(arr[i] === target){
            return i // Retorna o índice do elemento caso seja encontrado.
        };
    };
    return -1 // Retona -1 se o elemento não for encontado.
};

// Exemplo de Execução:

let arr = [10, 20, 30, 40, 50];
let target = 30;
let result = linear_search(arr, target);
console.log(result !== -1 ? `Elemento encontrado no índice: ${result}` : `Elemento não encontrado`);

