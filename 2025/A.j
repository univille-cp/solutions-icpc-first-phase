import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        // Variáveis do problema
        int N = 0; // número de frutas
        int M = 0; // número de turmas
        int G[][]; // matrix NxM
        Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();
        // Faz a leitura dos inteiros N M
        String vetor[] = linha.split(" ");
        N = Integer.parseInt(vetor[0]);
        M = Integer.parseInt(vetor[1]);
        // Cria a matriz NxM
        G = new int[N][M];
        for(int i =0; i < N; i++){
            // Faz a leitura da linha i da Matriz
            linha = sc.nextLine();
            // divide pelo caracter espaço
            vetor = linha.split(" ");
            // Pega cada elemento j  da linha i e coloca na matriz
            for(int j =0; j < M; j++){
                G[i][j] = Integer.parseInt(vetor[j]);
            }
        }
        // conta o total de alunos
        int total  = 0;
        // percorre a matriz por coluna
        for(var i  = 0 ; i < M; i++){
            // inicializa a variavel maior com -1
            // no problema é indicado que o menor valor possivel é o Zero
            int maior = -1;
            for(var j = 0; j < N; j++){
                // verifica quem é o maior elemento da coluna i
                maior = Integer.max(maior,G[j][i]);
            }
            // Soma a quantidade de alunos
            total += maior;
        }
        // Imprime o resultado
        System.out.println(total);
    }

}
