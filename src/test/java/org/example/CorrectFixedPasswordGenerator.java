package org.example;

public class CorrectFixedPasswordGenerator implements org.example.PasswordGenerator{
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
