public class MaxAndMin {

    public static void main(String[] args) {

        int min = min(new int[] {12, 8, -2, 0});
        System.out.println("Minimum value from 12, 8, -2, 0 is: " + min);
        int min2 = min(new int[] {50, 23, 140, 222});
        System.out.println("Minimum value from 50, 23, 140, 222 is: " + min2);

        System.out.println();

        int max = max(new int[] {12, 8, -2, 0});
        System.out.println("Maximum value from 12, 8, -2, 0 is: " + max);
        int max2 = max(new int[] {50, 23, 140, 222});
        System.out.println("Maximum value from 50, 23, 140, 222 is: " + max2);
    }

        public static int min(int[] list) {
            int min = list[0];
            for (int i = 1; i < list.length; i++) if (min > list[i]) min = list[i];
            return min;
        }
        public static int max(int[] list) {
            int max = list[0];
            for (int i = 1; i < list.length; i++) if (max < list[i]) max = list[i];
            return max;
        }
}
