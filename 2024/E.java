import java.util.Scanner;

public class E {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int size = leitor.nextInt();
        int matriz[][] = new int[size][size];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        boolean achou = true;
        //zero giros
        for (int i = 1; i < matriz.length; i++) {
            if(matriz[0][i-1] > matriz[0][i] || matriz[i-1][0] > matriz[i][0]) {
                achou = false;
                break;
            }
        }
        if (achou) {
            System.out.println("0");
            return;
        }
        achou = true;
        //1 giro
        for (int i = matriz.length -1, j  = 1; i > 0; i--, j++) {
            if(matriz[0][i-1] < matriz[0][i] || matriz[j-1][matriz.length -1] > matriz[j][matriz.length -1]) {
                achou = false;
                break;
            }
        }
        if (achou) {
            System.out.println("1");
            return;
        }
        achou = true;
        //2 giro
        for (int i = matriz.length -1; i > 0; i--) {
            if(matriz[matriz.length -1][i-1] < matriz[matriz.length -1][i] || matriz[i-1][matriz.length -1] < matriz[i][matriz.length -1]) {
                achou = false;
                break;
            }
        }
        if (achou) {
            System.out.println("2");
        }else{
            System.out.println("3");
        }

    }

}
