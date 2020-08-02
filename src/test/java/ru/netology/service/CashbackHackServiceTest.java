package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfAmount0() {

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldRemainIfAmount1000() {

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldRemainIfAmount500() {

        assertEquals(service.remain(500), 500);
    }

    @Test
    public void shouldRemainIfAmount999() {

        assertEquals(service.remain(999), 1);
    }

}
