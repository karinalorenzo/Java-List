package dev.karina.list_java.WeekDaysHandleTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.karina.list_java.WeekDaysHandle.WeekDaysHandle;

import java.util.List;

public class WeekDaysHandleTest {
    private WeekDaysHandle manager;

    @BeforeEach
    void setUp() {
        manager = new WeekDaysHandle();
    }

    @Test
    void testCreateListDays() {
        manager.createListDays();
        assertEquals(7, manager.getSizeList());
    }

    @Test
    void testGetWeekDays() {
        manager.createListDays();
        List<String> days = manager.getWeekDays();
        assertEquals(7, days.size());
        assertTrue(days.contains("Monday"));
    }

    @Test
    void testGetSizeList() {
        manager.createListDays();
        assertEquals(7, manager.getSizeList());

    }

    @Test
    void testDeleteDays() {
        int sizeIndex = manager.getSizeList();
        manager.createListDays();
        assertEquals(sizeIndex - 1, manager.getSizeList());
    }

    @Test
    void testGetSolicitedDay() {
        manager.createListDays();
        assertEquals("Monday", manager.getDay(0));
        assertNull(manager.getDay(10));
    }

    @Test
    void testExistDay() {
        manager.createListDays();
        assertTrue(manager.existDay("Wednesday"));
        assertFalse(manager.existDay("Party"));
    }

    @Test
    void testOrderDays() {
        manager.createListDays();
        manager.orderDays();
        assertEquals("Sunday", manager.getWeekDays());
    }

    @Test
    void testEmptyList() {
        manager.createListDays();
        manager.emptyList();
        assertEquals(0, manager.getSizeList());
    }
}