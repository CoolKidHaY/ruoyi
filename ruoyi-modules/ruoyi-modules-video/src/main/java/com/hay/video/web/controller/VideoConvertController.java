package com.hay.video.web.controller;

import com.hay.video.query.FfmpegQuery;
import com.ruoyi.common.core.domain.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: VideoConvertController
 * @Author HuangYan
 * @Date: 2022/1/24 15:59
 * @Version 1.0
 * @Description: 视频转换控制器
 */
@RestController
@Api(value = "视频转换控制器", tags = {"视频转换控制器"})
@RequestMapping("/video/convert")
public class VideoConvertController {

    @PostMapping("/gif")
    @ApiOperation(value = "视频转换为gif", notes = "视频转换为gif")
    public R convertToGif(FfmpegQuery ffmpegQuery) {
        return R.ok();
    }

}
