package org.skypro.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Это задачи из вебинара

public class UserGreeterTest {

   private UserGreeter userGreeter = new UserGreeter("Hello");

    @Test
    @DisplayName("When name Vasya is passed to user greeter then user greeter returns correct hello")
    public void correctNameTest() {
        String actualresult = userGreeter.greetUser("Vasya");
        Assertions.assertNotNull(actualresult); //проверка на не null
        assertEquals("Hello,Vasya", actualresult, "Greeter should return Hello, Vasya"); //проверяем что право равно лево
    }

    @Test
    @DisplayName("When name is null then Hello, Anonymous is returned.")
    void nullNameTest() {
        String actualResult = userGreeter.greetUser(null);
        assertEquals("Hello, Anonymous", actualResult);
    }

    @Test
    @DisplayName("When name is null then Hello, Anonymous is returned.")
    void emptyNameTest() {
        String actualResult = userGreeter.greetUser("");
        assertEquals("Hello, Anonymous", actualResult);
    }

    @Test
    @DisplayName("When user greeter is created with 'Привет' then user greeter returns Привет, Вася ")
    void specialHelloTest(){
        UserGreeter userGreeter = new UserGreeter("Привет");
        String actualResult = userGreeter.greetUser("Вася");
        assertEquals("Привет,Вася", actualResult);
    }

    @Test
    @DisplayName("When hello method called then hello counter returns 1")
    void helloCounterTest(){
        this.userGreeter.greetUser("");
        int actual = this.userGreeter.getHelloCounter();
        assertEquals(1,actual);
    }


}
