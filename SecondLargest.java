package array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args)
    {
        System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));

        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));

        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
    }

    private static int secondLargest(int[] ints) {
        /*
        Arrays.sort(ints);
        return ints[ints.length-2];

         */

        //without sorting
        int firstLargest,secondLargest;
        if(ints[0]>ints[1]){
            firstLargest=ints[0];
            secondLargest=ints[1];
        }else {
            firstLargest=ints[1];
            secondLargest=ints[0];
        }

        for (int i=2;i<ints.length;i++){
            if (ints[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=ints[i];
            }
            else if (ints[i]<firstLargest&&ints[i]>secondLargest){
                secondLargest=ints[i];
            }
        }
        return secondLargest;
    }
}
