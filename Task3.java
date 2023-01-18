import java.util.Random;

public class Task3 {
    //Дан двумерный массив.
    //1. Вывести на экран элемент, расположенный в правом верхнем углу массива
    //2. Вывести на экран элемент, расположенный в левом нижнем углу массива

    public static void main(String[] args) {
        // 1 1 3 3
        // 2 2 3 3
        // 3 4 2 3
        double[][] array = new double[3][2];

        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = r.nextDouble(0, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("элемент, расположенный в правом верхнем углу массива = " + array[0][array[0].length - 1]);
        System.out.println("элемент, расположенный в левом нижнем углу массива = " + array[array.length - 1][0]);
    }
}
