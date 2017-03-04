import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by hazit on 04.03.17.
 */
public class mod2 {
    public static void main(String[] args) {

        int array[] = {-3, 14, 88, 15, 161, 23, 54, 6, 7, 33};
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            if (max < array[i])
                max = array[i];
            }
                System.out.println("Максимальне число в масиві = " + max);


        int nmax = array[0];
        for (int i = 0; i < 10; i++) {
            if (nmax > array[i])
                nmax = array[i];
        }
                System.out.println("Мінімаьне число в масиві = " + nmax);


        int sum = array[0];
        for (int i = 0; i < 10; i++) {
            sum = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
        }
                System.out.println("Сумма чисел в масиві = " + sum);

        int maxP = array [0];
        for (int i = 0; i < array.length; i++) {
            if (maxP < array[i])
                maxP = array[i];
        }
                System.out.println("максимальне додaтнє число = " + maxP);

        int mul = array[0];
        for (int i = 0; i < 10; i++) {
            mul = array[0] * array[1] * array[2] * array[3] * array[4] * array[5] * array[6] * array[7] * array[8] * array[9];
        }
                System.out.println("Сумма чисел в масиві = " + mul);

        int first = array[0];
         for (int i = 0; i < array.length; i++) {
            if (array[0] <= 0)
                first = array[0] * (-1);
        }
                System.out.println("перший елемент масива по модулю = " + first);

        int last = array[9];
        for (int i = 0; i < 10 ; i++) {
            if(array[9] <=0)
                last = array[9] * (-1);
        }
                System.out.println("останній елемент масива по модулю = " + last);

  //      int secondmax = array[0];
        // for (int i = 0; i < array.length; i++) {
        //    if (secondmax < 161 && secondmax > 54 )
        //       secondmax = array[i];


      // }
        //        System.out.println(secondmax);
    }
}
