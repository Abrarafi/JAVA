import java.util.Scanner;
public class a1p6 {
    public static void Digitsum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.print(sum);

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a postive interger:");
        int n = input.nextInt();
        Digitsum(n);
        input.close();
    }
}
