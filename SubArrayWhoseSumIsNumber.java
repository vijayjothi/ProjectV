package array;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }

    private static void findSubArray(int[] ints, int input) {
        int sum=ints[0];
        int start=0;

        for (int i=1; i<ints.length;i++){
            sum=sum+ints[i];

            while(sum>input && start<=i-1){
                sum=sum-ints[start];
                start++;
            }

            if (sum==input){
                System.out.println("Continuous SubArray are"+
                        Arrays.toString(ints)+"Whose sum is "+input);
                for (int j=start;j<i;j++){
                    System.out.println(ints[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
