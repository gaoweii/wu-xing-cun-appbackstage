package com.wuxingcunappbackstage.wuxingcunappbackstage.index;

import com.alibaba.fastjson.JSON;
import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.CarouselList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor.BackgroundColor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping("/carouselList")
    public String carouselList() {
        CarouselList carouselList = new CarouselList();
        String[] strings = new String[3]; //测试数据 随便写的几个
        strings[0] = "123";
        strings[1] = "345";
        strings[2] = "3453";
        BackgroundColor[] backgroundColors = new BackgroundColor[3];
        backgroundColors[0] = new BackgroundColor();
        backgroundColors[1] = new BackgroundColor();
        backgroundColors[2] = new BackgroundColor();
        backgroundColors[0].setRed(203);
        backgroundColors[0].setGreen(87);
        backgroundColors[0].setBlue(60);
        backgroundColors[1].setRed(205);
        backgroundColors[1].setGreen(215);
        backgroundColors[1].setBlue(218);
        backgroundColors[2].setRed(183);
        backgroundColors[2].setGreen(73);
        backgroundColors[2].setBlue(69);
        carouselList.setBackgroundColors(backgroundColors);
        carouselList.setImages(strings);
        String jsonUsers = JSON.toJSONString(carouselList); //阿里的fastjson工具，能将类转化为json字符串格式


        return jsonUsers;
    }
}
