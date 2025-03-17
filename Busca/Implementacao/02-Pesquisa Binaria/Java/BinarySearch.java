// Pesquisa Binária (Binary Search)

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int left = 0; int right = arr.length -1;

        while (left <= right){
            int mid = left + (left + right) / 2; // Evita overflow em grandes números

            if (arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    };

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;
        int result = binarySearch(arr, target);
        System.out.println(result != -1 ? "Elemento encontrado no índice: " + result : "Elemento não encontrado");
    };
};


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