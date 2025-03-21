// Recursão (Recursion) - Fatorial Recursivo

function fatorial(n) {
    if (n === 0 || n == 1) {
        return 1;
    };

    return n * fatorial(n -1);
};

// Uso

console.log(fatorial(5));