package com.lesser.calendar.home.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CalendarMapper {
    List<Map<String, Object>> getPlanList(String paramStartDay);

    void insPlan(Map<String, String> map);

    void delPlan(Map<String, String> map);

    List<Map<String, String>> getAllMemberList(int size, int offset);

    Map<String, String> getOneMember(String paramID);

    void insMember(Map<String, String> map);

    void delMember(String paramID);
}
