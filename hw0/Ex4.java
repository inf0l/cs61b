public class Ex4 {
    public static int[] windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                int inc = j + 1;
                if (i + inc > a.length - 1) {
                    break;
                }
                a[i] += a[i + inc];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
