package dev.karina.list_java.WeekDaysHandle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeekDaysHandle {
    private List<String> weekDays;

    public WeekDaysHandle() {
        this.weekDays = new ArrayList<>();
        createListDays();
    }

    public void createListDays() {
        weekDays.clear();
        Collections.addAll(weekDays, "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    }

    public List<String> getWeekDays() {
        return new ArrayList<>(weekDays);
    }

    public int getSizeList() {
        return weekDays.size();
    }

    public void deleteDay(String day) {
        weekDays.remove(day);
    }

    public String getSolicitedDay(int i) {
        if (i >= 0 && i < weekDays.size()) {
            return weekDays.get(i);
        }
        return null;
    }

    public boolean existDay(String day) {
        return weekDays.contains(day);
    }

    public void orderDays() {
        Collections.sort(weekDays);
    }

    public void emptyList() {
        weekDays.clear();
    }
}
