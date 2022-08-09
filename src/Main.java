public class Main {
    public static void main(String[] args) {
// Задание 1
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
            if (a == 10) {
                System.out.println(" ");
            }
        }
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
            if (i == 1) {
                System.out.println(" ");
            }
        }
        // Задание 2
        int friday = 1;
        for (int i = 1; friday < 31; i++) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }

        // Задание 3
        int cometYearAppearance = 0;
        int year = 2022;
        int lastTwoHundredYears = year - 200;
        int end = year + 100;
        for (int i = 0; cometYearAppearance < end; i++) {
            if (cometYearAppearance >= lastTwoHundredYears) {
                System.out.println("Комета пролетала над Землей в " + cometYearAppearance);
            }
            else {
            }
            cometYearAppearance = cometYearAppearance + 79;

        }
    }
}