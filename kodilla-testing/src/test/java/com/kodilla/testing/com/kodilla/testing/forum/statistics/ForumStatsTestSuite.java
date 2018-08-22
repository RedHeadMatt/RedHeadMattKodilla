package com.kodilla.testing.com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatsTestSuite {

    @Before
    public void beforeDisplay(){
        System.out.println("TESTS - start!");
    }

    @After
    public void afterDisplay(){
        System.out.println("TESTS - stop!");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("CLASS - start!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("CLASS - stop!");
    }

    @Test
    public void testCalculateadvancedStatistics1(){

        //Test for postsCount = 0;

        int postsCount = 0;
        System.out.println("postsCount = 0");
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(postsCount);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);
        Assert.assertEquals(0, forumStats.numOfPosts);
    }

    @Test
    public void testCalculateadvancedStatistics2(){

        //Test for postsCount = 1000;

        int postsCount = 1000;
        System.out.println("postsCount = 1000");
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(postsCount);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);
        Assert.assertEquals(1000, forumStats.numOfPosts);
    }

    @Test
    public void testCalculateadvancedStatistics3(){

        //Test for commentsCount = 0;

        int commentsCount = 0;
        System.out.println("commentsCount = 1000");
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(commentsCount);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);
        Assert.assertEquals(0, forumStats.numOfComments);
    }

    @Test
    public void testCalculateadvancedStatistics4(){

        //Test for commentsCount < postsCount

        int postsCount = 10;
        int commentsCount = 100;
        System.out.println("commentsCount > postsCount");
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(commentsCount);
        when(statistics.postsCount()).thenReturn(postsCount);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);

         Assert.assertEquals(10, forumStats.numOfPosts);



    }
    @Test
    public void testCalculateadvancedStatistics5(){

        //Test for commentsCount < postsCount

        int postsCount = 10;
        int commentsCount = 1;
        System.out.println("commentsCount < postsCount");
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(commentsCount);
        when(statistics.postsCount()).thenReturn(postsCount);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);

         Assert.assertEquals(10, forumStats.numOfPosts);

    }

    @Test
    public void testCalculateadvancedStatistics6(){

        //Test for userNames = 0;

        List<String> usersNames = new ArrayList<String>();


        System.out.println("userNames = 0");
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(usersNames);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);

        Assert.assertEquals(0, forumStats.numOfUsers);

    }

    @Test
    public void testCalculateadvancedStatistics7(){

        //Test for userNames = 100;

        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            usersNames.add("a");
        }

        System.out.println("userNames = 100");
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(usersNames);

        ForumStats forumStats = new ForumStats();

        forumStats.calculateAdvStatistics(statistics);

        Assert.assertEquals(100, forumStats.numOfUsers);

    }
}
