package com.ruoyi.system.api.factory;

import com.ruoyi.system.api.RemoteVideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @title: RemoteVideoServiceFallback
 * @Author HuangYan
 * @Date: 2022/1/24 15:00
 * @Version 1.0
 * @Description: 视频远程服务降级处理
 */
@Component
public class RemoteVideoServiceFallback implements FallbackFactory<RemoteVideoService> {

    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    @Override
    public RemoteVideoService create(Throwable throwable) {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteVideoService() {
        };
    }
}
