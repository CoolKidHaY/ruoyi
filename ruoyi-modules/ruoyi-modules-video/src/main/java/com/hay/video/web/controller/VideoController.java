package com.hay.video.web.controller;

import com.ruoyi.system.api.RemoteLogService;
import com.ruoyi.system.api.domain.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: VideoController
 * @Author HuangYan
 * @Date: 2022/2/10 13:45
 * @Version 1.0
 * @Description: ADD YOUR DESCRIPTION
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private RemoteLogService remoteLogService;

    @GetMapping("/test")
    public String getVideo(){
        remoteLogService.saveLog(new SysOperLog(), "inner");
        return "video test success";
    }

}
