public class Ex_1 {
    public static void main(String[] args) {
        int saveMoney = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total += saveMoney;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений = " + total + " рублей");
        }
        //System.out.println("Месяц " + i + " сумма накоплений = " + total + " рублей");
    }
}
