import java.util.Scanner;

public class Task1 {

    //Дана не пустая последовательность целых чисел, оканчивающаяся нулем. Найти:
    //        1. сумму всех чисел последовательности;
    //        2. количество всех чисел последовательности

    public static void main(String[] args) {
        // 2 5 1 523 3 12 0
        // 1 3 12 0
        // 0

        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;

        do {
            number = sc.nextInt();
            sum += number;
            count++;
        } while (number != 0);

        sc.close();

        System.out.println("Сумма всех чисел последовательности = " + sum);
        System.out.printf("Количество всех чисел последовательности = %d", count);
    }
}
