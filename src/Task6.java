import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner a = new Scanner ( System.in);

        System.out.println( "Введите первое число");
        int number1 = a.nextInt(); //считывает первое число
        System.out.println ("Введите второе число");
        int number2 = a.nextInt(); //считывает второе число
        System.out.println ("Введите третье число");
        int number3 = a.nextInt();//считывает третье число



        if(number1<number2)
            {if(number1<number3)
                    { System.out.println ("Минимальное число  " + number1);}
           else { System.out.println ("Минимальное число  " + number3);}
            }
        else {
            if (number2 < number3) {
                System.out.println("Минимальное число  " + number2);
            } else {
                System.out.println("Минимальное число  " + number3);
            }
        }




    }

}
