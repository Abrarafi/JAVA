import java.util.Scanner;
public class a1p3 {
    public static void multiple(int n, int m){
        int mul = 0;
        for(int i = 1;i<=m;i++){
            mul = mul+n;
        }
        System.out.print("result: "+mul);
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the 1st number:");
        int number = input.nextInt();
        System.out.print("Input 2nd Number:");
        int number2 = input.nextInt();
        multiple(number ,number2);

    }
}
