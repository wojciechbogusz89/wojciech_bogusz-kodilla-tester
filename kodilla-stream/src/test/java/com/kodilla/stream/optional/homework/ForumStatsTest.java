package com.kodilla.stream.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void shouldCountAverageOfPostsUsersOver40() {
        List<User> testList = UserRepository.getUserList();
        double test = ForumStats.averageOfPostsOver40(testList);
        assertEquals(2.25, test);
    }
    @Test
    public void shouldCountAverageOfPostsUsersUnder40() {
        List<User> testList = UserRepository.getUserList();
        double test = ForumStats.averageOfPostsUnder40(testList);
        assertEquals(2382, test);
    }



}