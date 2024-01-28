
import java.util.Scanner;
import java.util.Arrays;
public class a1p7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a text in line : ");
        String s = input.nextLine();
        String arr[]= s.split(" ");
        //Arrays.sort(arr);
        String s1="";
        String s2="";
        int mx=0;
        int ml=0;
        for(int i=0;i<arr.length;i++) {
            if(ml<arr[i].length())
            {
                ml=arr[i].length();
                s2=arr[i];
            }
            if(arr[i]=="-1")continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    count++;
                    s1=arr[i];
                    arr[j]="-1";
                }
            }
            if(mx<count)
            {
                s1=arr[i];
                mx=count;
            }
        }
        System.out.println("Most frequent word: "+s1);
        System.out.println("word with max length: "+s2);

    }
}
