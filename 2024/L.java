import java.util.Arrays;
import java.util.Scanner;

public class L {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int vetor[] = new int[n];
        for(int i =0; i < n ; i++){
            vetor[i] = leitor.nextInt();
        }
        int contagem [] = new int[30];
        int novosNumeros[][] = new int [n][30];
        for(var e : vetor){
            String bin = Integer.toBinaryString(e);
            bin = String.format("%30s", bin).replace(' ', '0');
            int index = 0;
            for(var c : bin.toCharArray()){
                contagem[index] += c == '1'? 1 : 0;
                index++;
            }
        }
        for(int i =0; i < n; i++){
            StringBuilder builder = new StringBuilder();
            for(int j =0; j < 30; j++){
                if(contagem[j]>0){
                    novosNumeros[i][j] = 1;
                    contagem[j]--;
                }
                builder.append(novosNumeros[i][j]);
            }
            System.out.print(Integer.parseInt(builder.toString(), 2));
            if(i < n-1){
                System.out.print(" ");
            }
        }


    }

}
