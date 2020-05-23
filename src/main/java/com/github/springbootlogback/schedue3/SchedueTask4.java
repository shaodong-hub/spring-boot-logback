package com.github.springbootlogback.schedue3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 创建时间为 11:26 2019-06-12
 * 项目名称 spring-boot-logback
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Slf4j(topic = "ERROR")
@Service
public class SchedueTask4 {

    @Scheduled(fixedRate = 1000)
    public void task() {
        log.error("schedue2---error:{}", new Date().toString());
    }

}
