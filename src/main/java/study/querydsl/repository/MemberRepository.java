package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.domain.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //select m from member m where m.username = :username
    List<Member> findByUsername(String username);
}
