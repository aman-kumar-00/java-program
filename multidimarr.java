import java.util.Arrays;
import java.util.Random;
public class multidimarr {
    public static void main (String[] args){



        int [][]arr = new int[3][4];
        Random random = new Random();



        for (int i = 0; i <3 ; i++) {

            for (int j = 0; j <4 ; j++) {
                arr[i][j] = random.nextInt(100); // 0 to 99

                System.out.print(arr[i][j]+"  ");

            }

            System.out.println();

        }



    }
}
