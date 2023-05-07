package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemoryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    } //dependency injection

    /**
     * 회원가입
     * @param member 멤버 구조
     * @return
     */
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()) // optional 이 감싸지면 NULL 인 경우를 optional로 표현하므로 사용성이 변화함.
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
        // 단 optional 객체를 반환하는 것은 권장되지 않음.
        // 차라리 체크하는 메서드를 호출하고, 거기 뒤에 추가 메서드를 호출한다.
        // 만약 이런 내용이 특정 메서드 내부에 추가로 쓰여지게 된다면 하위 메서드로 만들면 된다. cmd+opt+m

    }

    /**
     * 전체 인원 조회
     * @return
     */
    // 서비스 클래스 쪽은 비즈니스쪽 용어에 가깝게 쓰는 것이 좋다.
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
