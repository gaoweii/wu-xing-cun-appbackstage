package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo;

import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/scenicarea/img")
public class ImageController {
    private String imgSrc;
    @RequestMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage(@RequestParam String img) throws IOException {
        imgSrc = "src/main/resources/" + img + ".jpg";
        return new ImageStream(imgSrc).getBytes();
    }
}
