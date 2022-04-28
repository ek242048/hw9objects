package ru.skypro;

import ru.skypro.hw9objects.Author;
import ru.skypro.hw9objects.Book;

public class Main {

    public static void main(String[] args) {
	    //Задаю книги и авторов для примера:
        String bookNameFirst = "Бесы";
        String authorNameFirst = "Федор Достоевский";
        int publishingYearFirst = 1872;

        String bookNameSecond = "Война и мир";
        String authorNameSecond = "Лев Толстой";
        int publishingYearSecond = 1869;


        Author dostoevsky = new Author("Федор", "Достоевский");
        System.out.println(dostoevsky.getAuthorFirstName() + " " + dostoevsky.getAuthorSecondName()  );

        Author tolstoi = new Author("Лев", "Толстой");
        System.out.println(tolstoi.getAuthorFirstName() + " " + tolstoi.getAuthorSecondName());

        Book first = new Book("Бесы", dostoevsky,  1872);
        System.out.println(first.getBookName() + ", " + first.getAuthorName().getAuthorFirstName() + " " + first.getAuthorName().getAuthorSecondName() + ", " + first.getPublishingYear() );

        Book second = new Book("Война и мир", tolstoi,  1869);
        System.out.println(second.getBookName() + ", " + second.getAuthorName().getAuthorFirstName() + " " + second.getAuthorName().getAuthorSecondName() + ", " + second.getPublishingYear() );


        System.out.println(dostoevsky);
        System.out.println(tolstoi);
        System.out.println(first);
        System.out.println(second);

        Author a3 = new Author("Лев", "Толстой");
        System.out.println(tolstoi.equals(a3));

        Author a4 = new Author("Айн", "Рэнд");
        System.out.println(tolstoi.equals(a4));


        Book b3 = new Book("Анна Каренина",a3,1877);
        System.out.println(first.equals(b3));

        Book b4 = new Book("Война и мир", a3,1869);
        System.out.println(second.equals(b4));


        System.out.println(b3.hashCode());

        System.out.println(b4.hashCode());
        System.out.println(second.hashCode());

        System.out.println(a3.hashCode());
        System.out.println(tolstoi.hashCode());

        System.out.println(dostoevsky.hashCode());


        first.setPublishingYear(2020);
        System.out.println("публикация " + first.getPublishingYear() + " года");


    }
}
