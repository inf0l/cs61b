public class Ex1b {
    public static void drawTriangle(int n) {
        int i = 0;
        String stars = "*";

        while (i < n) {
            System.out.print(stars);
            System.out.println();
            stars += "*";
            i++;
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
