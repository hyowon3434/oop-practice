package org.example;

public class User {

    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();
        // 비밀번호가 최소 8자 이사 ㅇ12자 이하여야 한다.
        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
