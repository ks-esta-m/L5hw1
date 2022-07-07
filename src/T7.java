import java.util.Scanner;
import java.lang.Math;
//Даны стороны двух треугольников.
// Найти сумму их периметров и сумму их площадей.
// (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)
public class T7 {
    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
    int c1 = sc.nextInt();
    int a2 = sc.nextInt();
    int b2 = sc.nextInt();
    int c2 = sc.nextInt();

    int p1 = a1 + b1 + c1;
    int p2 = a2 + b2 + c2;
    int sum1 = p1 + p2;
        System.out.println(sum1);
    float r1=(a1+b1+c1)/2;
    double s1=Math.sqrt((r1*(r1-a1)*(r1-b1)*(r1-c1)));
    float r2=(a2+b2+c2)/2;
    double s2=Math.sqrt((r2*(r2-a2)*(r2-b2)*(r2-c2)));
    double sum2=s1+s2;
         System.out.println(sum2);
}
}