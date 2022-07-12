package lesson3.practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (int i = 0; i < arr.length; i++) {

            try {
                if (arr[i] == 7 || arr[i] == 12) {
                    throw new MyLibMatrixProcessingException(i, arr);
                }
            }catch (MyLibMatrixProcessingException e){
                arr[i]=0;
            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
