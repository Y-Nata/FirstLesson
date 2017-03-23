package pack3;

import java.util.Arrays;

/**
 * Created by admin on 03.03.2017.
 */
public class SecondClass3 {

    int[] arrDigits = new int[11];
    int[] seconsArr = {0, 1, 2, 3, 4, 5};


    public static void main(String[] args) {
        SecondClass3 sc = new SecondClass3();
        System.out.println(Arrays.toString(sc.arrDigits));
        System.out.println(Arrays.toString(sc.seconsArr));

        sc.arrDigits[4] = sc.seconsArr[5];
        sc.arrDigits[3] = sc.seconsArr[4];

        System.out.println(Arrays.toString(sc.seconsArr));


        for(int i=10; i >=6; i--){
            sc.arrDigits[i] = i;
        }
        System.out.println(Arrays.toString(sc.arrDigits));

        int j = 0;
        while(j < sc.arrDigits.length){
            System.out.println(j);
            j++;

        }
        int[] test = new int[8];
        int[] test1 = new int[12];

        for(int i=7; i>=0; i--){
            test [i]= i;
            System.out.println(Arrays.toString(test));
        }
    }


}


