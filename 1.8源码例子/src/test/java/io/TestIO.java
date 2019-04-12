package io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by liyinyong on 2018/7/14.
 */
public class TestIO {
    @Test
    public void testFileInputStream() throws IOException {
        File file = new File("src/main/resources/io/test.txt");
        InputStream test = new FileInputStream(file);
        byte[] data = new byte[2048];
        test.read(data);
        System.out.println(new String(data));
        test.close();
    }
    @Test
    public void testBufferInputStream(){

    }
}
