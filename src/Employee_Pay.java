import java.util.Scanner;

public class Employee_Pay {
    public static void main(String[] args) {
        int employee_number,pay_rate,number_of_hour;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter employee number");
        employee_number=scanner.nextInt();
        System.out.println("please enter the pay rate");
        pay_rate=scanner.nextInt();
        System.out.println("please enter how many hour you work per week");
        number_of_hour=scanner.nextInt();
        if((number_of_hour>60)||(pay_rate>25)){
            System.out.println("error try later the employee’s weekly pay is not to be calculated.");
            System.exit(0);
        }
        else{
            int weekly_pay;
            if(number_of_hour<35){
                weekly_pay=pay_rate*number_of_hour;
                System.out.println("your weekly payment is "+weekly_pay);
            }
            else{
                weekly_pay=pay_rate*number_of_hour*number_of_hour/2;
                System.out.println("your weekly paymnet is "+weekly_pay);
            }
        }

    }
}
