package dev_kare_exercie_week_day_manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private WeekDayManager manager;

    @BeforeEach
    void setUp() {
        manager = new WeekDayManager();
        manager.createWeekDayList();
    }

    @Test
    void testCreateWeekDayList() {
        assertEquals(7, manager.getListSize());
        assertTrue(manager.dayExists("Lunes"));
        assertTrue(manager.dayExists("Domingo"));
    }

    @Test
    void testGetWeekDays() {
        assertEquals(7, manager.getWeekDays().size());
        assertTrue(manager.getWeekDays().contains("Miércoles"));
    }

    @Test
    void testRemoveDay() {
        assertTrue(manager.removeDay("Lunes"));
        assertEquals(6, manager.getListSize());
        assertFalse(manager.removeDay("Lunes"));
    }

    @Test
    void testGetDay() {
        assertEquals("Lunes", manager.getDay(0));
        assertNull(manager.getDay(7));
    }

    @Test
    void testSortDaysAlphabetically() {
        manager.sortDaysAlphabetically();
        assertEquals("Domingo", manager.getDay(0));
        assertEquals("Viernes", manager.getDay(6));
    }

    @Test
    void testClearList() {
        manager.clearList();
        assertEquals(0, manager.getListSize());
    }
}
