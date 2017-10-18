package com.web.mirsla.Service.inter;

import com.web.mirsla.entity.Member;

/**
 * @author: Mirsla
 * @descripTion:
 * @date: Created in  11:22 2017/10/18
 * @modified By:
 */
public interface LoginService {

    /**
     * 校验用户名memberName
     * @param memberName
     * @return
     */
    public Boolean checkMemberName(String memberName);

    /**
     * 校验当前email是否存在
     * @param email
     * @return
     */
    public Boolean checkEmail(String email);

    /**
     * 添加用户
     * @param member
     * @return
     */
    public Integer insertMember(Member member);

}
