package com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.name = name;
        //real name of the user
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        // do nothing
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody){
        // do nothing
        ForumComment comment = new ForumComment(thePost, commentBody, author);
        comments.add(comment);
    }

    public int getPostsQuantity(){
        // return 100 temporarily
        return posts.size();

    }

    public int getCommentsQuantity(){
        // return 100 temporarily
        return comments.size();
    }

    public ForumPost getPost(int postNumber){
        // returning null means that the operation was unsuccessful
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber){
        // returning null means that the operation was unsuccessful
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost){
        // return true temporarily
        boolean result = false;
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment){
        // return true temporarily
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
