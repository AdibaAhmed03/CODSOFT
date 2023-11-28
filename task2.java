import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Total number of subjects:");
        int sub=sc.nextInt();
        for(int i=1;i<=sub;i++){
            System.out.println("Enter Marks Obtain in Subject"+i+" out of 100: ");
            int marks=sc.nextInt();
            sum+=marks;
        }
        System.out.println("Total Marks obtain is "+sum);
        int percentage=sum/sub;
        System.out.println("Your Average Percentage is "+percentage);
        if(percentage>=80){
            System.out.println("Your Grade is A");
        }
        else if(percentage<80 && percentage>=60){
            System.out.println("Your Grade is B");
        }
        else if(percentage<60 && percentage>=40){
            System.out.println("Your Grade is C");
        }
        else if(percentage<40 && percentage>=33){
            System.out.println("Your Grade is D");
        }
        else{
            System.out.println("Fail!");
        }



    }
}
