package com.kodilla.testing.com.kodilla.testing.forum.statistics;

public class ForumStats {

    int numOfUsers = 0;
    int numOfPosts = 0;
    int numOfComments = 0;
    double AvgPostsPerUser = 0;
    double AvgCommentsPerUser = 0;
    double AvgCommentsPerPost = 0;

    public void calculateAdvStatistics(Statistics statistics){

        numOfUsers = statistics.usersNames().size();
        numOfPosts = statistics.postsCount();
        numOfComments = statistics.postsCount();
        AvgPostsPerUser = (double) numOfPosts / (double) numOfUsers;
        AvgCommentsPerUser = (double) numOfComments / (double) numOfUsers;
        AvgCommentsPerPost = (double) numOfComments / (double) numOfPosts;

    }


    public void showStatistics(){

        System.out.println("FORUM STATISTICS: ");
        System.out.println("Number of users: "+numOfUsers);
        System.out.println("Number of posts "+numOfPosts);
        System.out.println("Number of comments: "+numOfComments);
        System.out.println("Avg number of posts per user: "+AvgPostsPerUser);
        System.out.println("Avg number of comments per user: "+AvgCommentsPerUser);
        System.out.println("Avg number of comments per post: "+AvgCommentsPerPost);
    }
}
