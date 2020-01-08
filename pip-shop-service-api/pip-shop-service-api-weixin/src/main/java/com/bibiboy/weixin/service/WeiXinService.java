package com.bibiboy.weixin.service;

import com.bibiboy.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 微信服务层
 */
public interface WeiXinService {

    /**
     * 获取应用接口
     * @return
     */
    @GetMapping("/getApp")
    AppEntity getApp();
}
