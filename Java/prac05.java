import java.util.Scanner;
public class prac05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number:");
        int n = sc.nextInt();
        sc.close();
        boolean isPrime=true;
        for(int i=1;i<=n;i++){
            isPrime=true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime ->"+i);
            }
        }
    }
}