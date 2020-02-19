package com.wuxingcunappbackstage.wuxingcunappbackstage.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageStream {
    private String src;
    private byte[] bytes;

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte[] getBytes() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(src));
        bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

    public ImageStream(String _src) {
        this.src = _src;
    }
}
