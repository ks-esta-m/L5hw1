
import java.util.Scanner;

public class L5_hw4 {//Вычислить сумму 1+1/2+1/3+...+1/n

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("Введите n - количество повторений числа");
        n = sc.nextDouble();

     double sum=0;

        sum+=1/n;
        for (int i = 1; i <= n; i++) {
                        }
       System.out.println(String.format("%.3f", sum));
    }
}



