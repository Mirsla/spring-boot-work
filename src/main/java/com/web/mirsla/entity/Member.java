package com.web.mirsla.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: Mirsla
 * @descripTion: 会员属性
 *
 * @GeneratedValue ID生成策略
 * @Table 对应数据库表名，若不写，代表数据库表名和类名一致
 * @Temporal(TemporalType.DATE)： 如果属性是时间类型，因为数据表对时间类型有更严格的划分，所以必须指定具体时间类型
 * @Temporal(TemporalType.DATE)       日期
 * @Temporal(TemporalType.TIME)       时间
 * @Temporal(TemporalType.TIMESTAMP) 两者兼具
 *
 * @date: Created in  16:29 2017/10/17
 * @modified By:
 */

@Entity
@Table(name = "member")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "member_name",nullable = false, length = 30, unique = true)
    private String memberName;

    @Column(name = "e_mail", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "pass_word", nullable = false, length = 30)
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "create_when")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createWhen;

    @Column(name = "modify_when" )
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyWhen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateWhen() {
        return createWhen;
    }

    public void setCreateWhen(Date createWhen) {
        this.createWhen = createWhen;
    }

    public Date getModifyWhen() {
        return modifyWhen;
    }

    public void setModifyWhen(Date modifyWhen) {
        this.modifyWhen = modifyWhen;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", createWhen=" + createWhen +
                ", modifyWhen=" + modifyWhen +
                '}';
    }
}
