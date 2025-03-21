// Recursão (Recursion) - Fatorial Recursivo

public class Recursion {
    public static int fatorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fatorial(n -1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
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
