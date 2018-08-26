package com.kodilla.stream.book;

public final class Book {

    private final String title;
    private final String author;
    private final String signature;
    private final int yearOfPublication;

    public Book(String title, String author,  int yearOfPublication, String signature) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", signature='" + signature + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
