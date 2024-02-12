package com.dev.domain.member.service;


import com.dev.domain.member.controller.request.DetailMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final DetailMemberService detailMemberService;

    public DetailMemberDto getMember(Long memberId) {
        return detailMemberService.getMember(memberId);
    }
}
