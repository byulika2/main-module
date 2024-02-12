package com.dev.domain.member.repository;

import com.dev.domain.member.controller.request.DetailMemberDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.dev.domain.member.QMember.member;

@Repository
@RequiredArgsConstructor
public class DetailMemberRepository {

    private final JPAQueryFactory queryFactory;

    public DetailMemberDto getMember(Long memberId) {
        return queryFactory.select(Projections.fields(DetailMemberDto.class,
                        member.id,
                        member.email
                ))
                .from(member)
                .where(member.id.eq(memberId))
                .fetchOne();
    }

}
