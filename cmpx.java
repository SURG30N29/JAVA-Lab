import java.util.Scanner;
class Complex{
    int real;
    int imaginary;
    void input(int R, int I){
        this.real=R;
        this.imaginary=I;
        System.out.println(real+" + "+imaginary+"i");
    }
    void add(Complex C1,Complex C2){
        real=C1.real+C2.real;
        imaginary=C1.imaginary+C2.imaginary;
        System.out.println("The sum of the 2 complex numbers is: "+real+" + "+imaginary+"i");
    }
    void subtract(Complex C1, Complex C2){
        real=C1.real-C2.real;
        imaginary=C1.imaginary-C2.imaginary;
        System.out.println("The difference of the 2 complex numbers is: "+real+" + "+imaginary+"i");
    }
    void multiply(Complex C1, Complex C2){
        real=(C1.real*C2.real)-(C1.imaginary*C2.imaginary);
        imaginary=(C1.real*C2.imaginary)+(C1.imaginary*C2.real);
        System.out.println("The product of the 2 complex numbers is: "+real+" + "+imaginary+"i");
    }
}
class cmpx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex C1 = new Complex();
        C1.input(6,8);
        Complex C2 = new Complex();
        C2.input(10,12);
        Complex C3= new Complex();
        C3.add(C1,C2);
        C3.subtract(C1,C2);
        C3.multiply(C1,C2);
    }
}