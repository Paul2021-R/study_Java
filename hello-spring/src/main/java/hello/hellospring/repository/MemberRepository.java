package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long Id); // Optional Java 8에 들어간 기능, 간단하게 말하면 Null이 반환될 때 optional로 감싸서 진행하는 방식이다.
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
