package com.lesser.calendar.home.service;

import java.util.List;
import java.util.Map;

public interface MemberService {
    List<Map<String, String>> getAllMemberList();

    Map<String, String> getOneMember(String paramID);

    void insMember(Map<String, String> map);

    void delMember(String paramID);

}