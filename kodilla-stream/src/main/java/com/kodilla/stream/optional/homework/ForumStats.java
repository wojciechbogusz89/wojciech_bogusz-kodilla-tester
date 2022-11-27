package com.kodilla.stream.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averageOfPostsOver40(UserRepository.getUserList()));
        System.out.println(averageOfPostsUnder40(UserRepository.getUserList()));

    }
    public static double averageOfPostsOver40(List<User> userList) {
        double average = userList
                .stream()
                .filter( x -> x.getAge() >= 40 )
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }

    public static double averageOfPostsUnder40(List<User> usersList) {
        double average = usersList
                .stream()
                .filter( x -> x.getAge() < 40 )
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }
}

