import java.util.Scanner;

//Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*"
public class Hw2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Введите n");

        int n;
        n = sc.nextInt(); // введение результата с консоли//


                     print6(n);
    }

     public static void print6(int n) {

        String row = "*";

        for (int i = 0; i < n; i++) {

            System.out.print(row);
        }
    }
}







