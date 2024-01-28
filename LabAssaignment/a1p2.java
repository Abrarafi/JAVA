import java.util.Scanner;

public class a1p2 {
    public static int division_by_substraction(int n,int d){
        int cnt = 0;
        while(n>0){
            n = n-d;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Input the dividend:");
        int number = input.nextInt();
        System.out.print("Input the divider:");
        int divider = input.nextInt();
        System.out.println("Result: "+division_by_substraction(number,divider));
        input.close();
    }
}

