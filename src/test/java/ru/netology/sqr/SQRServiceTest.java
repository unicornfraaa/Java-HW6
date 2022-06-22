package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldFindCount3() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCount6() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 400);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCount15() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 600);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }
}
