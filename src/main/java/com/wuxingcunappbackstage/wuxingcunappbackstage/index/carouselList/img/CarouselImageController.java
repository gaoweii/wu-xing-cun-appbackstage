package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.img;
import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.io.IOException;

@RestController
public class CarouselImageController {
    private String imgSrc;
    @RequestMapping(value = "/index/carouselList/img", produces = MediaType.IMAGE_JPEG_VALUE, method = RequestMethod.GET)
    public byte[] getImage(@RequestParam String img) throws IOException {
        imgSrc = "src/main/resources/" + img + ".jpg";
        return new ImageStream(imgSrc).getBytes();
    }
}
