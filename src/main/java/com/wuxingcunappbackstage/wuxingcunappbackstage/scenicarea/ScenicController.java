package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea;

import com.alibaba.fastjson.JSON;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo.ScenicAreaInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenicarea")
public class ScenicController {
    @RequestMapping
    public String getInfo(@RequestParam int id) {
        ScenicAreaInfo scenicAreaInfo = new ScenicAreaInfo();
        String[] srcs = new String[3];
        for(int i = 0; i < 3; ++i) {
            srcs[i] = "http://192.168.0.104:7000/scenicarea/img?img=img" + String.valueOf(i + 1);
        }
        scenicAreaInfo.setImgSrcs(srcs);
        String introduction = "非常美丽的风景，俊俏的山峰，蓝蓝的天空。";
        scenicAreaInfo.setIntroduction(introduction);
        return JSON.toJSONString(scenicAreaInfo);
    }
}
