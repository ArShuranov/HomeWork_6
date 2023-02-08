public class Ex_6 {
    public static void main(String[] args) {
        double percentPerMonth = 7;
        int numberOfMonth = 9 * 12;
        int total = 15_000;

        for (int i = 1; i <= numberOfMonth; i++) {
            total += total * (percentPerMonth / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);

            }

        }
    }
}
