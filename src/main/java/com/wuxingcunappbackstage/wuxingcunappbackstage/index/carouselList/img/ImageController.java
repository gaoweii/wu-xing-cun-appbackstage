package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.img;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class ImageController {
    private String imgSrc;
    @RequestMapping(value = "/index/carouselList/img", produces = MediaType.IMAGE_JPEG_VALUE, method = RequestMethod.GET)
    public byte[] getImage(@RequestParam String img) throws IOException {
        imgSrc = "src/main/resources/" + img + ".jpg";
        FileInputStream inputStream = new FileInputStream(new File(imgSrc));
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }
}
