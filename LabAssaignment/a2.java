import java.util.Scanner;
public class a2 {
    public class StudentRecordManager{
    int studentid;
    String name;
    int marks[];
    public static double calculateavg(int[] marks){
        double sum = 0;
        for(int i = 0;i< marks.length;i++){
            sum+=marks[i];
        }
        double avg = sum/ marks.length;
        return avg;
    }
    public static int findmax(int[] marks){
        int mx = 0;
        for(int i = 0;i<marks.length;i++){
            if(mx<marks[i]){
                mx = marks[i];
            }
        }
        return mx;
    }
    public static int findmin(int[] marks){
        int mn = 1000000;
        for(int i = 0;i<marks.length;i++){
            if(mn>marks[i]){
                mn = marks[i];
            }
        }
        return mn;
    }
        public static void displayStudentDetails(int studentId, String name, int[] marks){
            System.out.println("ID : "+studentId);
            System.out.println("Name : "+name);
            System.out.print("Marks : ");
            for(int i = 0;i<marks.length;i++){
                System.out.print(marks[i]+ " ");
            }
            System.out.println();
            System.out.println("Average : "+calculateavg(marks));
            System.out.println("Maximum marks : "+findmax(marks));
            System.out.println("Minimum marks : "+findmin(marks));
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[] marks1 = {80, 85, 90, 75, 95};
        int[] marks2 = {70, 65, 80, 75, 60};
        StudentRecordManager.displayStudentDetails(101, "Alice", marks1);
        StudentRecordManager.displayStudentDetails(102, "Bob", marks2);


    }
}
