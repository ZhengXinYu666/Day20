package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：把图片   WechatIMG265.jpeg   复制到Demo/证件照.jpeg
 *
 * 数据源：
 *      /Users/Z/Download ---读取数据---FileInputStream
 * 目的地：
 *      /Users/Z/DeskTop/Demo---写出数据---FileOutputStream
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("/Users/Z/DeskTop/WechatIMG264.jpeg");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("/Users/Z/DeskTop/Demo/证件照.jpeg");

        int by = 0;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
