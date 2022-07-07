import java.util.Scanner;

public class Task1 {
    //Вчемпионате по футболу команде за выигрыш дается 3 очка,
    // за проигрыш — 0, за ничью — 1. Известно количество очков, полученных командой за игру.
    // Определить словесный результат игры (выигрыш, проигрыш или ничья).

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt(); // введение результата с консоли//

        if (result>3) {
            System.out.println("Введите заново, не может быть больше 3");
                    }
        if (result==2) {
            System.out.println("Введите заново, не может быть равно 2");
        }

        if (result==3) {
            System.out.println("Выигрыш");
        }
        if (result==0) {
            System.out.println("Проигрыш");
        }

        if (result==1) {
            System.out.println("Ничья");
        }
            }
}
