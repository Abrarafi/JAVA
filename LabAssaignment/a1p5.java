import java.util.Scanner;
public class a1p5 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input first string: ");
        String s1=input.nextLine();
        System.out.print("Input second string: ");
        String s2=input.nextLine();
        boolean isfound=s1.contains(s2);
        if(isfound==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

