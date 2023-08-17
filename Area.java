import java.util.Scanner;
public class Main{
    public static int getDim(int l,int b) {
        return l*b;
    }

    public static int getArea(int a) {
        System.out.println("The area of the rectangle is "+a+" sq. units");
        return 0;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, a;
        System.out.println("Enter the length and breadth of the rectangle: ");
        l = sc.nextInt();
        b = sc.nextInt();
        a= getDim(l,b);
        getArea(a);
    }
}
