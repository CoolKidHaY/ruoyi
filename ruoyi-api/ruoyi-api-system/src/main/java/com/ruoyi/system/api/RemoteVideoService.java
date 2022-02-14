package com.ruoyi.system.api;

import com.ruoyi.system.api.factory.RemoteVideoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @title: RemoteVideoService
 * @Author HuangYan
 * @Date: 2022/1/24 14:59
 * @Version 1.0
 * @Description: 视频转换远程服务
 */
@FeignClient(contextId = "remoteVideoService", value = "ruoyi-video", fallback = RemoteVideoServiceFallback.class)
public interface RemoteVideoService {
}
