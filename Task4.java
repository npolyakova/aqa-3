public class Task4 {

    //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    //2. Распечатать последний символ строки. Используем метод String.charAt().
    //3. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
    //4. Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
    //5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    //6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
    //7. Заменить все символы “а” на “о”.
    //8. Преобразуйте строку к верхнему регистру.
    //9. Преобразуйте строку к нижнему регистру.
    //10. Вырезать строку Java c помощью метода String.substring().

    public static void main(String[] args) {
        String a = "I like Java!!!";
        printText(a);

        //2. Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(a.length());
        System.out.println(a.charAt(a.length() - 1));

        //3. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(a.endsWith("!!!"));

        //5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(a.contains("C++"));

        //10. Вырезать строку Java c помощью метода String.substring().
        String newString = a.substring(a.indexOf("l"));
        System.out.println(newString.substring(0, newString.indexOf(" ")));
    }

    //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static void printText(String text) {
        System.out.println(text);
    }
}
