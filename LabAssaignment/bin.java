import java.util.Scanner;
public class a1p3 {
    public static int multiple(int n, int m){
        int mul = 0;
        for(int i = 1;i<=m;i++){
            mul = mul+n;
        }
        return mul;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the 1st number:");
        int number = input.nextInt();
        System.out.print("Input 2nd Number:");
        int number2 = input.nextInt();
        System.out.print("Result"+multiple(number,number2));

    }
}
