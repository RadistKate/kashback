package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(900);

        Assert.assertEquals(expected,actual);


    }@Test
    public void testRemainLess() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int expected = 200;
        int actual = cashbackHackService.remain(800);

        Assert.assertEquals( expected, actual);

    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        Assert.assertEquals( expected, actual);


    }

    @Test
    public void testRemain999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(999);

        Assert.assertEquals( expected, actual);
    }

}