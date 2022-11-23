package com.kodilla.stream;

import javax.lang.model.element.Name;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {


    List<String> chemistsGroupUsernames = filterChemistGroupUsernames(35);
        System.out.println(chemistsGroupUsernames);


    }
    public static  List<String> filterChemistGroupUsernames(int age){
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .filter(user -> user.getAge()>age)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static String getUserName (User user) {
        return user.getUsername();
    }

    public static int getUserAge (User user) {
        return user.getAge();
    }
}
