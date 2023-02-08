public class Ex_8 {
    public static void main(String[] args) {
        int presentYear = 2023;
        int period = 79;

        for (int i = 0; i < presentYear + 100; i += period) {
            if (i > presentYear - 200 && i < presentYear + 100) {
                System.out.println(i);
            }
        }
    }
}
