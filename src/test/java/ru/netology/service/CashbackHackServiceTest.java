package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfAmount0() {

        Assertions.assertEquals(1000, service.remain(0));;
    }

    @Test
    public void shouldRemainIfAmount1000() {

        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRemainIfAmount500() {

        Assertions.assertEquals(500, service.remain(500));
    }

    @Test
    public void shouldRemainIfAmount999() {

       Assertions.assertEquals(1, service.remain(999));
    }

}
