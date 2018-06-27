package ru.reksoft;

/**
 * Created by Варвара on 16.05.2018.
 */
public class Lesson3_Test {
    public static void main(String[] args) {
        String books[] = {"Три мушкетера","Тихий Дон","Вий","Война и мир","Преступление и наказание",
                "Капитанская дочка","Сказка о Царе Салтане","123","1234567","Преступление и наказания"};
        if (books.length > 0) {
            int minname = books[0].length();
            int maxname = books[0].length();
            String min = "";
            String max = "";
            for (String book: books) {
                if (book.length()<minname){
                    minname = book.length();
                    min = book+ " ";
                } else if (book.length()== minname) {
                    min+=book + "";
                }
                if (book.length()>maxname){
                    maxname = book.length();
                    max = book+ " ";
                } else if (book.length()==maxname) {
                    max+=book + "";
                }
            }

            System.out.println(min + ", " + max);
        }

    }
}
