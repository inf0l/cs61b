public class Ex1a {
    public static void main(String[] args) {
        int i = 0;
        String stars = "*";

        while (i < 5) {
            System.out.print(stars);
            System.out.println();
            stars += "*";
            i++;
        }
    }
}
