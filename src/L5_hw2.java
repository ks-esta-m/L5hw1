
//Напечатать  числа следующим образом:
// 25 25.5 24.8
// 26 26.5 25.8
// ...
// 35 35.5 34.8

public class L5_hw2 {


    public static void main (String[] args){
       int j=0;
      for (int i=25; i<36; i++){
          j=i-1;
          System.out.println(i+" "+i+ ".5"+" "+j+".8");
      }

    }



}
