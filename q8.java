public class q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int evenSum = 0, oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println(evenSum - oddSum);
    }
}