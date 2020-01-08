package com.bibiboy.member.service.impl;

import com.bibiboy.member.feign.WeiXinServiceFeign;
import com.bibiboy.weixin.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService{

    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;

    @Override
    public AppEntity memberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}
