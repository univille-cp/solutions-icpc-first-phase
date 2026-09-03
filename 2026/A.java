import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int M[][] = new int[N][2];
        int compras[] = new int[N];
        int vendas[] = new int[N];
        for(int i =0; i < N; i++){
            M[i][0] = leitor.nextInt();
            M[i][1] = leitor.nextInt();
            if(i == 0){
                compras[0] = M[i][0];
                vendas[0] = M[i][1];
            }else{
                compras[i] = compras[i-1] + M[i][0];
                vendas[i] = vendas[i-1] + M[i][1];
            }
        }
        int Q = leitor.nextInt();
        int nj[] = new int[Q];
        for(int j =0; j < Q; j++){
            nj[j] = leitor.nextInt();
        }
        for(int j =0; j < Q; j++){
            int index = nj[j] -1;
            if(compras[index] == vendas[index]){
                System.out.println("NEUTRO");
            }else if(compras[index] > vendas[index]){
                System.out.println("COMPRA");
            }else{
                System.out.println("VENDA");
            }
        }

    }

}
