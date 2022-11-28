package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Jan.Kowalski", "adam_wozny", "any10", "aaa"})
    public void shouldReturnTrueForCorrectUsername(String input) {
        assertTrue(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa", "a", "!@#", "user!"})
    public void shouldReturnFalseForIncorrectUsername(String input){
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jankowalski@gmail.pl", "roman@onet.com", "andrzej@wp.com"})
    public void shouldReturnTrueForCorrectEmail(String input){
        assertTrue(validator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@.com", "abc@.com", "abc", "@com@"})
    public void shouldReturnFalseForIncorrectEmail(String input){
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseForEmptyUsername(String input){
        assertFalse(validator.validateUsername(input));
    }
    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseForEmptyEmail(String input) {
        assertFalse(validator.validateEmail(input));


}}