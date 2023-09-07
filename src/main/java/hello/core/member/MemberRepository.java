package hello.core.member;

public interface MemberRepository {

    void save(Member memvber);
    Member findById(Long memberId);
}
