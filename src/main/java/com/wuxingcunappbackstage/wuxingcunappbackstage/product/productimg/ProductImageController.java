package com.wuxingcunappbackstage.wuxingcunappbackstage.product.productimg;

import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/product/image")
public class ProductImageController {
    @RequestMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] images() throws IOException {
        return new ImageStream("").getBytes();
    }
}
