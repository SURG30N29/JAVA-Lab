import java.util.Scanner;
class bank{
    public static void createaccount(){
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Your account has been created");
    }
    public static void deposit(){
        Scanner sc=new Scanner(System.in);
        int amt,dep,acc;
        System.out.println("Enter your account number:");
        acc = sc.nextInt();
        System.out.println("Enter amount in account:");
        amt = sc.nextInt();
        System.out.println("Enter amount to be deposited:");
        dep = sc.nextInt();
        amt=amt+dep;
        System.out.println("Amount in account is:"+amt);
        System.out.println("Your amount has been deposited");
    }
    public static void withdraw(){
        Scanner sc=new Scanner(System.in);
        int amt,wth,acc;
        System.out.println("Enter your account number:");
        acc = sc.nextInt();
        System.out.println("Enter amount in account:");
        amt = sc.nextInt();
        System.out.println("Enter amount to be withdrawn");
        wth = sc.nextInt();
        amt=amt-wth;
        System.out.println("Amount in account is:"+amt);
        System.out.println("Your amount has been deposited");

    }
    public static void interest(){
        Scanner sc = new Scanner(System.in);
        double acc,p,rate,time,inst,amt,a;
        System.out.println("Enter your account number: ");
        acc = sc.nextDouble();
        System.out.println("Enter your principle amount: ");
        p = sc.nextDouble();
        System.out.println("Enter your rate of interest in percentage: ");
        rate = sc.nextDouble();
        rate/=100;
        System.out.println("Enter your tenure in years: ");
        time = sc.nextDouble();
        a=Math.pow(1+rate,time);
        amt=p*a;
        inst=amt-p;
        System.out.println("Your calculated interest is: "+inst);
    }
    public static void balance(){
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the condition you want to use:\n1 to Create account\n2 to Deposit\n3 to withdraw\n4 to Compute Interest\n5 to Display balance\n----------------");
        n = sc.nextInt();
        switch(n){
            case 1:
                createaccount();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                interest();
                break;
            case 5:
                balance();
                break;
            default:
                System.out.println("Input not valid");
        }

    }
}
