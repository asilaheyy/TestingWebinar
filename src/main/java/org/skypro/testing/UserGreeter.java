package org.skypro.testing;

//Это задачи из вебинара

public class UserGreeter {

    private final String helloString;
    private int helloCounter = 0;

    public UserGreeter(String helloString) {
        this.helloString = helloString;
    }

    public String greetUser(String username) {
        if (username == null || username.isBlank()) {
            username = " Anonymous";
        }
        this.helloCounter += 1;
        return this.helloString + "," + username;
    }

    public int getHelloCounter() {
        return helloCounter;
    }
}
