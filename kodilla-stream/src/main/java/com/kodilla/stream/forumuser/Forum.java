package com.kodilla.stream.forumuser;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<ForumUser>();

    public Forum() {
        theUsersList.add(new ForumUser(1, "ASD", 'M', LocalDate.now(), 50));
        theUsersList.add(new ForumUser(2, "ASD", 'M', LocalDate.of(1990, 8, 14), 50));
        theUsersList.add(new ForumUser(3, "ASD", 'M', LocalDate.of(1991, 9, 15), 0));
        theUsersList.add(new ForumUser(4, "ASD", 'M', LocalDate.of(1992, 10, 1), 60));
        theUsersList.add(new ForumUser(5, "ASD", 'M', LocalDate.of(1993, 11, 9), 510));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUsersList);
    }
}
