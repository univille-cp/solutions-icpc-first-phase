import java.util.Scanner;

public class K {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int C[] = new int[N];
        int K[] = new int[N];

        int total = 0;
        for(int i =0; i < N; i ++){
            C[i] = leitor.nextInt();
            total += C[i]; 
        }
        for(int i =0; i < N; i ++){
            K[i] = leitor.nextInt();
        }
        for(int i =0; i < N; i ++){
            if(K[i] > C[i]){
                System.out.println(-1);
                return;
            }
        }
        int res = 0;
        for(int i =0; i < N; i ++){
            res = Integer.max(res, total - C[i] + K[i]);
        }
        System.out.println(res);
    }

}
