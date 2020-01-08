package com.bibiboy.weixin.service.impl;

import com.bibiboy.weixin.entity.AppEntity;
import com.bibiboy.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信服务层实现类
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {

    @Override
    public AppEntity getApp() {
        return new AppEntity("123","bibiboy");
    }
}
