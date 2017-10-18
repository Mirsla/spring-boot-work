package com.web.mirsla.repository;

import com.web.mirsla.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Mirsla
 * @descripTion:
 * @date: Created in  10:32 2017/10/18
 * @modified By:
 */
public interface MemberRepository extends JpaRepository<Member,Long> {
    /**
     * 通过会员名查找会员
     * @param memberName
     * @return
     */
    Member findByMemberName(String memberName);

    /**
     * 通过ID查找Member
     * @param id
     * @return
     */
    Member findById(Long id);

    /**
     * 通过Email查找
     * @param email
     * @return
     */
    Member  findByEmail(String email);
}
