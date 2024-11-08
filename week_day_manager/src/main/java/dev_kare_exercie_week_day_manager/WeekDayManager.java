package dev_kare_exercie_week_day_manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeekDayManager {
    private List<String> weekDays;

    public WeekDayManager() {
        weekDays = new ArrayList<>();
    }

    public void createWeekDayList() {
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miércoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sábado");
        weekDays.add("Domingo");
    }

    public List<String> getWeekDays() {
        return new ArrayList<>(weekDays);
    }

    public int getListSize() {
        return weekDays.size();
    }

    public boolean removeDay(String day) {
        return weekDays.remove(day);
    }

    public String getDay(int index) {
        if (index >= 0 && index < weekDays.size()) {
            return weekDays.get(index);
        }
        return null;
    }

    public boolean dayExists(String day) {
        return weekDays.contains(day);
    }

    public void sortDaysAlphabetically() {
        Collections.sort(weekDays);
    }

    public void clearList() {
        weekDays.clear();
    }
}

