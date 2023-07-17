package com.batch;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member save(String name){
        return memberRepository.save(new Member(name));
    }
}
