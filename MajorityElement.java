package array;
/*
Input: arr[] = {1, 2, 3, 3, 3, 3, 10}, x = 3
Output: True (x appears more than n/2 times in the given array)

Input: arr[] = {1, 1, 2, 4, 4, 4, 6, 6}, x = 4
Output: False (x doesn't appear more than n/2 times in the given array)

Input: arr[] = {1, 1, 1, 2, 2}, x = 1
Output: True (x appears more than n/2 times in the given array)
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 4, 4, 4, 6, 6};
        int n=arr.length;
        int x=3;
        int count=majority(arr,n,x);
        System.out.println("count :"+count);
        int result= n/2;
        if (count>result){
            System.out.println("True ("+x+" appears more than "+result+" times in the given array)");
        }else {
            System.out.println("False ("+x+" doesn't appears more than "+result+" times in the given array)");
        }
    }

    private static int majority(int[] arr, int n,int x) {
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
