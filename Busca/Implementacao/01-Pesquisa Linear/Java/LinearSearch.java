// Pesquisa Linear (Linear Search)

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Retorna o índice do elemento encontrado
            }
        }
        return -1; // Retorna -1 se não encontrar o elemento
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int result = linearSearch(arr, target);
        System.out.println(result != -1 ? "Elemento encontrado no índice:" + result : "Elemento não encontrado");
    };
}


/* Execução: 

    No Java, o código-fonte (arquivo .java) precisa ser convertido em bytecode (arquivo .class) para que a Máquina Virtual Java (JVM) possa executá-lo. Isso significa que todos os exemplos em Java terão dois arquivos na pasta após a compilação:

    Arquivo .java → Código-fonte que você escreve.
    Arquivo .class → Código compilado que será executado pela JVM.

🔹 Opção 1: Compilar e Executar Manualmente no Terminal

    Compile o arquivo Java (gera o .class correspondente):

        ```javac java/LinearSearch.java```

    Execute o código Java:

        ```java -cp java LinearSearch```

🔹 Opção 2: Usando a Extensão do VS Code

    Instale a extensão "Code Runner" no VS Code:
        Abra um arquivo .java e clique no botão ▶️ "Run".

*/