package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identificationNumber;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(int identificationNumber, String userName, char sex, LocalDate birthDate, int numberOfPosts) {
        this.identificationNumber = identificationNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identyficationNumber=" + identificationNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}

