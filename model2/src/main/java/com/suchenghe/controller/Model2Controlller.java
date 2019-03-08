package com.suchenghe.controller;

import com.alibaba.fastjson.JSON;
import com.suchenghe.pojo.DeviceBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuChenghe
 * @date 2019/3/5 13:49
 */
@RestController("device_2_controller")
@RequestMapping("/device2")
public class Model2Controlller {
    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ResponseBody
    public String getList() {
        List<DeviceBean> deviceBeanList = new ArrayList<>();
        for(int i= 0;i<4;i++){
            DeviceBean deviceBean = new DeviceBean();
            deviceBean.setDeviceCode("2code"+i);
            deviceBean.setDeviceName("2name"+i);
            deviceBean.setDeviceStatus(String.valueOf(i));
            deviceBeanList.add(deviceBean);
        }
        return JSON.toJSONString(deviceBeanList);
    }
}
