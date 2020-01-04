package com.zzx.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzx.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @ClassName QuickstartConsumer
 * @Description
 * @Author zhangzx
 * @Date 2020/1/4 17:53
 * Version 1.0
 **/
@Component
public class QuickstartConsumer {

    // 20880是dubbo的默认端口号
    @Reference(url = "dubbo://localhost:20880")
    ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }
}
