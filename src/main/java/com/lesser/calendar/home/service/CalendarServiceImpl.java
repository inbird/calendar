package com.lesser.calendar.home.service;

import com.lesser.calendar.home.mapper.CalendarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CalendarServiceImpl implements CalendarService {
    private final CalendarMapper calendarMapper;
    @Override
    public List<Map<String, Object>> getPlanList(String paramStartDay ) {
        return calendarMapper.getPlanList(paramStartDay);
    }

    @Override
    public void insPlan(Map<String, String> map) {
        calendarMapper.insPlan(map);
    }

    @Override
    public void delPlan(Map<String, String> map) {
        calendarMapper.delPlan(map);
    }
}
