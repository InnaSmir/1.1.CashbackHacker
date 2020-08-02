package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemainIfAmount0() {
        assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldRemainIfAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void shouldRemainIfAmount500() {
        assertEquals(service.remain(500), 500);
    }

    @org.testng.annotations.Test
    public void shouldRemainIfAmount999() {
        assertEquals(service.remain(999), 1);
    }

}
