package com.bibiboy.member.service.impl;

import com.bibiboy.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员服务
 */
public interface MemberService {

    @GetMapping("/memberToWeiXin")
    AppEntity memberToWeiXin();
}
