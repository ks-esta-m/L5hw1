import java.util.Scanner;

public class Task2 {

    //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?//

    public static void main(String args[])

    {
        Scanner scanner = new Scanner(System.in);
        Integer r = scanner.nextInt();
        Integer side = scanner.nextInt();

        Double circleS = Math.pow(r, 2);
        System.out.println(circleS);

        Double squareS = Math.pow(side, 2);
        System.out.println(squareS);

        if (circleS > squareS) {
            System.out.println("Площадь круга больше");
        }
        if (circleS < squareS) {
            System.out.println("Площадь квадрата больше");
        }
        if (circleS.equals(squareS)) {
            System.out.println("Площадь квадрата равна площади круга");
        }

    }
}









