
package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void countThenumbersquare() {
        SQRService service = new SQRService();
        int actual = service.service(100, 200);
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

}