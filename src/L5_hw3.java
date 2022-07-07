
//Напечатать таблицу соответствия между весом в фунтах и
// весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г)
public class L5_hw3 {
 public static void main (String[] args) {
     for (int i = 1; i < 11; i++) {
         double j = i * 0.453;

         System.out.println(i + " " + String.format("%.3f", j));
     }
 }
}
