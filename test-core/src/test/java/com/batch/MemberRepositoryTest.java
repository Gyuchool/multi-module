package com.batch;

import com.batch.core.Member;
import com.batch.core.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void add () {
        Member member = memberRepository.save(new Member("gyucheol"));
        Member saved = memberRepository.findById(member.getId()).get();

        assertThat(member.getName()).isEqualTo(saved.getName());
    }
}
