package mvn_project.myapp.src.test.java;

import mvn_project.myapp.src.main.java.com.mycompany.app.App;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.DisplayName("Test for the recursively implemented fibonacci sequence.")
    void recursiveFib() {
        assertAll(() -> assertEquals(0, App.recursiveFib(0)),
                () -> assertEquals(1, App.recursiveFib(1)),
                () -> assertEquals(1, App.recursiveFib(2)),
                () -> assertEquals(2, App.recursiveFib(3)),
                () -> assertEquals(3, App.recursiveFib(4)),
                () -> assertEquals(55, App.recursiveFib(10)),
                () -> assertEquals(610, App.recursiveFib(15)),
                () -> assertEquals(4181, App.recursiveFib(19)));
    }
}