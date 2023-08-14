public class overload{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("The sum is "+ add(2,3));
        System.out.println("The sum is "+ add(2,3,4));
        System.out.println("The sum is "+ add(2.2,3.5));





    }
}