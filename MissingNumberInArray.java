package array;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int n = 8;

        int[] a = {1, 4, 5, 3, 7, 8, 6};

        //Step 1

        int sumOfNnumbers = sumOfNnumbers(n);

        //Step 2

        int sumOfElements = sumOfElements(a);

        int missingNumber=sumOfNnumbers-sumOfElements;
        System.out.println(missingNumber);
    }

    private static int sumOfElements(int[] a) {
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }

    private static int sumOfNnumbers(int n) {
        return (n*(n+1))/2;
    }
}
