public class Ex_5 {
    public static void main(String[] args) {
        double percentPerMonth = 7;
        int total = 15_000;
        int i = 0;

        while (total < 12_000_000) {
            total += total * (percentPerMonth / 100);
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);
            }
        }


    }
}
