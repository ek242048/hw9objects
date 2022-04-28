package ru.skypro.hw9objects;

import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author (String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName(){
        return this.authorFirstName;
    }

    public String getAuthorSecondName () {
        return this.authorSecondName;
    }

    @Override
    public String toString() {
        return "Автор: " + authorFirstName + " " + authorSecondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Author author = (Author) other;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorSecondName, author.authorSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSecondName);
    }
}
