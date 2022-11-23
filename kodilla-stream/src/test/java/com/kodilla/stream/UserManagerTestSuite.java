package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestSuite {
    @Test
    public void testUzytkownik() {
        List<String> result = UserManager.filterChemistGroupUsernames(45);
        assertEquals(1, result.size());
    }

}