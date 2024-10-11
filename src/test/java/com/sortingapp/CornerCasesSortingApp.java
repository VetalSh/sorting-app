package com.sortingapp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CornerCasesSortingApp {
    SortingApp mySortingApp = new SortingApp();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        SortingApp.sortIntegers(null);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testEmptyCase() {
        String[] array1 = new String[]{};
        SortingApp.sortIntegers(array1);
    }

    @Test
    public void testSingleElementArrayCase() {
        String[] array1 = new String[]{"5"};
        String[] array2 = Arrays.copyOf(array1, array1.length);
        SortingApp.sortIntegers(array1);
        Assert.assertArrayEquals(array1, array2);
    }

    @Test
    public void testSortedArraysCase() {
        String[] array1 = new String[]{"1", "5", "8", "10"};
        String[] array2 = new String[]{"1", "5", "8", "10"};
        SortingApp.sortIntegers(array1);
        Assert.assertArrayEquals(array2, array1);
    }
}
