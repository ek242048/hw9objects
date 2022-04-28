package ru.skypro.hw9objects;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book (String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " + bookName +  ", " + "автор: " + getAuthorName().getAuthorFirstName() + " " + getAuthorName().getAuthorSecondName() + ", " + "год издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
