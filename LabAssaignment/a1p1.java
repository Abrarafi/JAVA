import java.util.Scanner;
class a1p1 {
    public static void tobinary(int decimal)
    {
        int binary[]= new int[32];
        int index=0;
        int zeroes=0;int ones=0;
        while(decimal>0)
        {
            binary[index]=decimal%2;
            if(binary[index]==1)ones++;
            else zeroes++;
            index++;
            decimal=decimal/2;
        }
        System.out.print("The binary representation is: ");
        for(int i=index-1;i>=0;--i)
        {
            System.out.print(binary[i]);
        }
        System.out.println();
        System.out.println("Number of one bits:  "+ones);
        System.out.println("Number of zero bits:  :"+zeroes);

    }
    // public static void count(int binary[],int sz)
    // {

    // }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        tobinary(number);

        // closing the scanner object
        in.close();
    }
}
