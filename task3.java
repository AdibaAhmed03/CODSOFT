import java.util.Scanner;
public class currencyconverter {
    public static void main(String[] args) {
       double Rupee,Pound,Dollar,Euro;
        System.out.println("Currency converter! Here you can convert Amount in 4 currencies.");
        System.out.println("Select 1 for Rupee");
        System.out.println("Select 2 for Pound");
        System.out.println("Select 3 for Dollar");
        System.out.println("select 4 for Euro");
        Scanner sc=new Scanner(System.in);
        double choice=sc.nextDouble();
        if(choice==1){
            System.out.println("Enter Amount in Rupee: ");
            Rupee=sc.nextDouble();
            Pound=Rupee/94.46;
            System.out.println("Currency in Pound: "+Pound);
            Dollar=Rupee/77.34;
            System.out.println("Currency in dollar: "+Dollar);
            Euro=Rupee/80.36;
            System.out.println("Currency in Euro: "+Euro);
        }
        else if (choice==2) {
            System.out.println("Enter Currency in Pound: ");
            Pound=sc.nextDouble();
            Rupee=Pound*94.43;
            System.out.println("Currency in Rupee: "+Rupee);
            Dollar=Pound*1.22;
            System.out.println("Currency in Dollar: "+Dollar);
            Euro=Pound*1.17;
            System.out.println("Currency in Euro: "+Euro);
        }
        else if (choice==3) {
            System.out.println("enter Currency in Dollar");
            Dollar=sc.nextDouble();
            Rupee=Dollar*77.34;
            System.out.println("Currency in Rupee: "+Rupee);
            Pound=Dollar*0.82;
            System.out.println("Currency in pound: "+Pound);
            Euro=Dollar*0.96;
            System.out.println("Currency in Euro: "+Euro);
        }
        else if (choice==4) {
            System.out.println("Enter Currency in Euro: ");
            Euro= sc.nextDouble();
            Rupee=Euro*80.43;
            System.out.println("Currency in Rupee: "+Rupee);
            Pound=Euro*0.85;
            System.out.println("Currency in Pound: "+Pound);
            Dollar=Euro*1.84;
            System.out.println("Currency in Dollar: "+Dollar);

        }
        else{
            System.out.println("Invalid Choice!");
        }
    }
}
