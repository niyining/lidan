package com.ztravel.reuse.sso.service;

import java.util.List;

import com.ztravel.sso.po.OpenidMemberEntity;

public interface IOpenidMemberReuseService {

    void insertOpenidMember(OpenidMemberEntity openidMember);

    void updateOpenidMember(OpenidMemberEntity openidMember);

    void updateOpenidMemberToUnBind(OpenidMemberEntity openidMember);

    void deleteOpenidMemberByOpenId(String openId);

    OpenidMemberEntity selectOpenidMemberByOpenId(String openId);

    List<OpenidMemberEntity> selectOpenidMemberBymemberId(String memberId);

    int countOpenidMemberBymemberId(String memberId);

}
