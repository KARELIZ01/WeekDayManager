package dev_kare_exercie_week_day_manager;

public class App {
    public static void main(String[] args) {
        WeekDayManager manager = new WeekDayManager();
        manager.createWeekDayList();
        System.out.println("Días de la semana: " + manager.getWeekDays());
    }
}
