        import java.util.Scanner;

public class T6v1 {

        public static void main(String[] args) {
            Scanner i = new Scanner ( System.in);

            System.out.println( "Введите первое число");
            int number1 = i.nextInt(); //считывает первое число
            System.out.println ("Введите второе число");
            int number2 = i.nextInt(); //считывает второе число
            System.out.println ("Введите третье число");
            int number3 = i.nextInt();//считывает третье число

                        iPrint(Min(number1,number2,number3));}

            public static void  iPrint(int a){
                System.out.println(a);
            }

            public static int Min( int number1,int number2,int number3 ) {
                if (number1 < number2 ) {
                    if (number1 < number3) {
                        return number1;
                        //System.out.println("Минимальное число  " + number1);
                    } else {
                        return number3;
                        //System.out.println("Минимальное число  " + number3);
                    }
                } else {
                    if (number2 < number3 ) {
                        return number2;
                       // System.out.println("Минимальное число  " + number2);
                    } else {
                        return number3;
                        //System.out.println("Минимальное число  " + number3);
                    }
                }
            }

    }


