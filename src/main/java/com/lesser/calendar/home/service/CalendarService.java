package com.lesser.calendar.home.service;

import java.util.List;
import java.util.Map;

public interface CalendarService {
    List<Map<String, Object>> getPlanList(String paramStartDay);

    void insPlan(Map<String, String> map);

    void delPlan(Map<String, String> map);


}