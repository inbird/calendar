package com.lesser.calendar.home.controller;


import com.lesser.calendar.home.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all_member")
    public List<Map<String, String>> getAllMemberList(@RequestParam(defaultValue = "0") int page,
                                                      @RequestParam(defaultValue = "10") int size){
        //System.out.println(page + "/" + size);
        int offset = page * size;
        return memberService.getAllMemberList(size, offset);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/one_member")
    public Map<String, String> getOneMember(String id){
        return memberService.getOneMember(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
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

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/del_member")
    public void delMember(String id){
        //System.out.println("FROM Delete: " + id + "삭제 요청");
        memberService.delMember(id);
    }
}


