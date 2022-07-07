import java.util.Scanner;

//Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".

public class Hw1 {
    public static void main(String[] args) {

        print6( );
    }

    public static void print6( ) {

        String row = "*";

        for (int i = 0; i < 10; i++) {

                       System.out.print(row);
        }
    }
}

