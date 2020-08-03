package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceJunitApiTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainIfAmount0() {

        assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldRemainIfAmount1000() {

        assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void shouldRemainIfAmount500() {

        assertEquals(500, service.remain(500));
    }

    @org.junit.Test
    public void shouldRemainIfAmount999() {

        assertEquals(1, service.remain(999));
    }
}
