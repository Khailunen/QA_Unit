package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CashbackHackServiceTest{

    @Test
    public void remainAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected, "in order to get a bonus, you need to spend : " + expected);

    }

    @Test
    public void remainAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}