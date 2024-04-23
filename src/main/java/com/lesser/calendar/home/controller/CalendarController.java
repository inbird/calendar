package com.lesser.calendar.home.controller;


import com.lesser.calendar.home.service.CalendarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarService calendarService;

    @GetMapping("/plan_list")
    public List<Map<String, Object>>  getPlanList(){
        // 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
        int year = LocalDate.now().getYear();
        //int startYear = year-1;
        //int endYear = year+1;
        String startDay = year + "-01-01";
        System.out.println("START:" + startDay);
        //String endDay = endYear + "-12-31";
        //log.info("Start Day:{}", startDay );
        return calendarService.getPlanList(startDay);
    }

    @PostMapping("/ins_plan")
    public Map<String, String> insPlan(String title, String startStr, String endStr){

        System.out.println("title:" + title + "/startStr:" + startStr + "/endStr:" + endStr);

        Map<String, String> map = new HashMap<>();

        map.put("title", title);
        map.put("start_day", startStr);
        map.put("end_day", endStr);

        calendarService.insPlan(map);
        return map;
    }

    @PostMapping("/del_plan")
    public Map<String, String> delPlan(String title, String startStr){

        System.out.println("title:" + title + "/startStr:" + startStr);

        Map<String, String> map = new HashMap<>();

        map.put("title", title);
        map.put("start_day", startStr);

        calendarService.delPlan(map);
        return map;
    }
}


