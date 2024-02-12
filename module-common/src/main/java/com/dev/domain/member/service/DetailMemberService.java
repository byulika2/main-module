package com.dev.domain.member.service;

import com.dev.domain.member.controller.request.DetailMemberDto;
import com.dev.domain.member.repository.DetailMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetailMemberService {

    private final DetailMemberRepository detailMemberRepository;

    public DetailMemberDto getMember(Long memberId) {
        return detailMemberRepository.getMember(memberId);
    }
}
