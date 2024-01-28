import java.util.Scanner;
public class a1p4 {
    public static void RevString(String s){
        int x = s.length()-1;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '||i==0){
                for(int j = i==0?i:i+1;j<=x;j++){
                    System.out.print(s.charAt(j));
                    if(j==s.length()-1)
                    System.out.print( " ");
                }
                x=i;
            }
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string:");
        String s = input.nextLine();
        RevString(s);
        input.close();
    }
}
