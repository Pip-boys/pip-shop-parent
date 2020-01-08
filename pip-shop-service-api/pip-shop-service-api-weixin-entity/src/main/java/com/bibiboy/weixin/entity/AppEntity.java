package com.bibiboy.weixin.entity;

import lombok.Data;

@Data
public class AppEntity {
    private String AppId;
    private String AppName;

    public AppEntity(String appId, String appName) {
        AppId = appId;
        AppName = appName;
    }

    public AppEntity() {
    }
}
