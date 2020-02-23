package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea;

import com.alibaba.fastjson.JSON;
import com.wuxingcunappbackstage.wuxingcunappbackstage.Test;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo.ScenicAreaInfo;
import com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo.SwiperList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenicarea")
public class ScenicController {
    @RequestMapping
    public String getInfo(@RequestParam int id) {
        ScenicAreaInfo scenicAreaInfo = new ScenicAreaInfo();
        SwiperList[] swiperLists = new SwiperList[3];
        String[] srcs = new String[3];
        for(int i = 0; i < 3; ++i) {
            swiperLists[i] = new SwiperList();
            swiperLists[i].setId(i);
            swiperLists[i].setType("image");
            srcs[i] = Test.getIp() + "/scenicarea/img?img=img" + String.valueOf(i + 1);
            swiperLists[i].setUrl(srcs[i]);
        }
        scenicAreaInfo.setSwiperList(swiperLists);
        String introduction = "非常美丽的风景，俊俏的山峰，蓝蓝的天空。";
        scenicAreaInfo.setIntroduction(introduction);
        return JSON.toJSONString(scenicAreaInfo);
    }
}
