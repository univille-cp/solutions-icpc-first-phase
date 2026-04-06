import java.util.Scanner;

/**
 * Link do caderno de problemas: https://maratona.sbc.org.br/hist/2025/subbr-2025/maratona.pdf
 * Link no CodeForces: https://codeforces.com/gym/106073/problem/J
 * Problema J - João João
 */
public class J {

    public static  void main(String args[]) {
        boolean tarefasPorNivel[] = new boolean[4];
        Scanner leitor = new Scanner(System.in);
        // Faz a leitura da linha completa
        String linha = leitor.nextLine();
        // Divide a linha pelo caracter espaço
        String lista[] = linha.split(" ");
        // para cada tarefa, marca como feito "true"
        // Obs: vetor começa na posição Zero
        for(var s : lista){
            tarefasPorNivel[Integer.parseInt(s)-1] = true;
        }
        // total de tarefas que faltm fazer
        int tarefasQueFaltam = 4;
        // para cada tarefa,
        for(var feito : tarefasPorNivel){
            // se a tarefa foi feita,
            // desconta do total
            if(feito){
                tarefasQueFaltam--;
            }
        }
        // imprime o resultado
        System.out.println(tarefasQueFaltam);
    }

}
