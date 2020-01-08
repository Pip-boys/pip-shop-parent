package com.bibiboy.member.feign;

import com.bibiboy.weixin.entity.AppEntity;
import com.bibiboy.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("app-bibiboy-weixin")
public interface WeiXinServiceFeign extends WeiXinService {

}
