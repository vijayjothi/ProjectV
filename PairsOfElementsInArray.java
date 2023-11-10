package array;

import java.util.Arrays;

public class PairsOfElementsInArray {
    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
    }

    private static void findThePairs(int[] ints, int input) {
        Arrays.sort(ints);
        int i=0;
        int j=ints.length-1;

        while (i<j){
            if (ints[i]+ints[j]==input){
                System.out.println("The sum of "+ints[i]+" and "+ints[j]+ " is "+ input);
                i++;
                j--;
            } else if (ints[i]+ints[j]<input) {
                i++;
            } else if (ints[i]+ints[j]>input) {
                j--;
            }
        }
    }
}
