package com.lesser.calendar.home.service;

import com.lesser.calendar.home.mapper.CalendarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final CalendarMapper calendarMapper;

    @Override
    public List<Map<String, String>> getAllMemberList() {
        return calendarMapper.getAllMemberList();
    }

    @Override
    public Map<String, String> getOneMember(String paramId ) {
        return calendarMapper.getOneMember(paramId);
    }

    @Override
    public void insMember(Map<String, String> map) {
        calendarMapper.insMember(map);
    }

    @Override
    public void delMember(String paramId) {
        calendarMapper.delMember(paramId);
    }
}
