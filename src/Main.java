public class Main {
    public static void main(String[] args) {

        // Домашнее задание 3
        // Задание 1
        System.out.println("КОМЕТА.");
        int cometAppearance = 1896;
        int g = 1;
        System.out.println(cometAppearance);
        for (; g <= 2; g++) {
            cometAppearance = cometAppearance + 79;
            {
                System.out.println(cometAppearance);
            }
        }
        // Задание 2
        System.out.println("АЛГОРИТМ ТАБЛИЦы УМНОЖЕНИЯ НА 2");
        int w = 0;
        for (int h = 1; h <= 10; h++) {
            w = h * 2 ; {
                System.out.println("2*" + h + "=" + w);
            }
        }
    }
}
