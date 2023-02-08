public class Ex_3 {
    public static void main(String[] args) {
        int population = 12_000_000;
        int born = 17; // x 1000
        int death = 8; // x 1000
        int yearCount = 10;
        for (int i = 1; i <= yearCount; i++) {
            population = population + ((population / 1000) * born) - ((population / 1000) * death);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }
}
