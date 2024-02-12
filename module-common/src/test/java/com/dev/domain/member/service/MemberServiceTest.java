package com.dev.domain.member.service;

import com.dev.CommonApplication;
import com.dev.domain.member.controller.request.DetailMemberDto;
import com.dev.domain.member.repository.DetailMemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = CommonApplication.class)
@ActiveProfiles("local")
class MemberServiceTest {

    @Autowired
    DetailMemberRepository detailMemberRepository;

    @Test
    void getMemberTest() {
        DetailMemberDto memberDto = detailMemberRepository.getMember(1L);
        Assertions.assertEquals(memberDto.getEamil(), "chris@tistory.com");
    }

}