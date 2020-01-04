package com.zzx.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzx.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @ClassName QuickStartServiceImpl
 * @Description
 * @Author zhangzx
 * @Date 2020/1/4 17:12
 * Version 1.0
 **/
@Service(interfaceClass = ServiceAPI.class)
@Component
public class QuickStartServiceImpl implements ServiceAPI {

    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message" + message;
    }
}

