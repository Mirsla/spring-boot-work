package com.web.mirsla.Service.impl;

import com.web.mirsla.Service.inter.LoginService;
import com.web.mirsla.entity.Member;
import com.web.mirsla.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mirsla
 * @descripTion:
 * @date: Created in  10:35 2017/10/18
 * @modified By:
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Boolean checkMemberName(String memberName) {
        Integer count = memberRepository.countByMemberName(memberName);
        if(count > 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Boolean checkEmail(String email) {
        Integer count = memberRepository.countByEmail(email);
        if(count > 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Member insertMember(Member member) {
        member = memberRepository.save(member);
        return member;
    }
}
