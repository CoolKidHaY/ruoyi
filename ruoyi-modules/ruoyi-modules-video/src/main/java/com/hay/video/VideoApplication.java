package com.hay.video;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: VideoApplication
 * @Author HuangYan
 * @Date: 2022/1/24 14:18
 * @Version 1.0
 * @Description: 视频转化gif
 */
@EnableCustomConfig
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableRyFeignClients(basePackages = {"com.ruoyi", "com.hay"})
@MapperScan("com.hay.video.mapper")
public class VideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
        System.out.println("\"(♥◠‿◠)ﾉﾞ  视频转换任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \\n\"" +
                "                        _            _     _            \n" +
                " _ __ _   _  ___  _   _(_)    __   _(_) __| | ___  ___  \n" +
                "| '__| | | |/ _ \\| | | | |____\\ \\ / / |/ _` |/ _ \\/ _ \\ \n" +
                "| |  | |_| | (_) | |_| | |_____\\ V /| | (_| |  __/ (_) |\n" +
                "|_|   \\__,_|\\___/ \\__, |_|      \\_/ |_|\\__,_|\\___|\\___/ \n" +
                "                  |___/                                 ");
    }
}
