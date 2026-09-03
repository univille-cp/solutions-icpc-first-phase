import java.util.Scanner;

public class C {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int C = leitor.nextInt();
        int K = leitor.nextInt();
        int exterior = T * K;
        System.out.println(C < exterior ? C: exterior);
    }

}
