package com.wuxingcunappbackstage.wuxingcunappbackstage.tools;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Component
public class ImageStream {
    private String src;
    private byte[] bytes;

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public byte[] getBytes() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(src));
        bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

}
