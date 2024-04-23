package com.lesser.calendar.home.controller;


import com.lesser.calendar.home.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/all_member")
    public List<Map<String, String>> getAllMemberList(){
        return memberService.getAllMemberList();
    }

    @GetMapping("/one_member")
    public Map<String, String> getOneMember(String id){
        return memberService.getOneMember(id);
    }

    @GetMapping("/ins_member")
    public Map<String, String> insMember(String id, String name, String email){

        Map<String, String> map = new HashMap<>();

        map.put("id", id);
        map.put("name", name);
        map.put("email", email);
        //System.out.println("INS_MEMBER:" + map);
        memberService.insMember(map);
        return map;
    }

    @GetMapping("/del_member")
    public void delMember(String id){
        memberService.delMember(id);
    }
}


