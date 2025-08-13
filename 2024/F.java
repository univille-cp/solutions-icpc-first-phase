import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();

        if(n == 1){
            System.out.println("1");
            return;
        }
        if(n == 2){
            System.out.println("2");
            return;
        }
        int n1 = 1;
        int n2 = 2;
        int current =2;
        for (int i = 3; i <= n; i++) {
            current = n2 + n1;
            n1 = n2;
            n2 = current;
        }
        System.out.println(current);
    }

}
