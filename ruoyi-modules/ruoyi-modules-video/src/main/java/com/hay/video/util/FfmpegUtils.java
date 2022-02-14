package com.hay.video.util;

import com.hay.video.query.FfmpegQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @title: FfmpegUtils
 * @Author HuangYan
 * @Date: 2022/1/24 16:12
 * @Version 1.0
 * @Description: ffmpeg工具类 ./ffmpeg-3.0/ffmpeg -ss 1 -t 11 -i video.mp4 -vf "scale=iw/4:-1:flags=lanczos,fps=8" video1.gif
 */
public class FfmpegUtils {

    private static final Logger log = LoggerFactory.getLogger(FfmpegUtils.class);

    private static final String VIDEO_PATH = "ffmpeg-3.0/ffmpeg";
    private static final String GIF_PATH = "/home/upload/video/gif/";


    public static void convertToGif(FfmpegQuery query) {
        StringBuilder sb = new StringBuilder();
        sb.append("/root/video/ffmpeg-3.0/ffmpeg -ss ")
                .append(query.getStartTime() == null ? "0" : query.getStartTime())
                .append(query.getEndTime() == null ? " -t " + query.getDuration() : "")
                .append(" -i ")
                .append(query.getVideoPath())
                .append(" -vf \"scale=iw/4:-1:flags=lanczos,fps=")
                .append(query.getFps() == null ? 8 : query.getFps())
                .append("\" ")
                .append(GIF_PATH)
                .append(query.getVideoName());
        log.info("ffmpeg执行命令：{}", sb);
        ProcessBuilder processBuilder = new ProcessBuilder(sb.toString());
        processBuilder.redirectErrorStream(true);
        try {
            Process process = processBuilder.start();
            log.info("ffmpeg执行线程：{}", processBuilder);
            InputStream errorStream = process.getErrorStream();
            InputStream inputStream = process.getInputStream();

            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
