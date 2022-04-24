package ru.skypro.hw9objects;

public class Hw9Objects {

    public static void hw9Objects() {

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


        first.setPublishingYear(2020);
        System.out.println("publishingYearFirst = " + first.getPublishingYear());


    }


}
