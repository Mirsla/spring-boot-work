package com.web.mirsla.Service.inter;

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

}
