package array;

public class LeadersInArray {
    public static void main(String[] args) {
        findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});

        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});

        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});

        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
    }


    private static void findTheLeaders(int[] input) {
        int max =input[input.length-1];

        System.out.println("The leader elements are :");

        System.out.println(input[input.length-1]);

        for (int i=input.length-2;i>=0;i--){
            if (input[i]>max){
                max=input[i];
                System.out.println(max);
            }
        }


    }
}
