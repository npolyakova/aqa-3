import java.util.Random;

public class Task2 {

    //Дан массив. Составить программу:
    //1. расчета квадратного корня из любого элемента массива;
    //2. расчета среднего арифметического двух любых элементов массива
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(3,10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 100);
            System.out.println(array[i]);
        }

        int randomElement = r.nextInt(0, array.length);
        System.out.println(sqrtFromElement(array[randomElement]));
        System.out.println("Рандомный элемент массива " + randomElement);

        average(array[0], array[1]);
    }

    public static double sqrtFromElement(int number) {
        return Math.sqrt(number);
    }

    public static void average(int number1, int number2) {
        System.out.println("Среднее арифметическое = " + (number1 + number2) / 2);
    }
}
