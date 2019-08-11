package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("/Users/Z/DeskTop/20.26.avi");

    FileOutputStream fos = new FileOutputStream("/Users/Z/DeskTop/Demo/视频.avi");

    byte[] bys = new byte[1024];
    int len = 0;
            while((len=fis.read(bys))!= -1){
                    fos.write(bys,0,len);
                    }
            //释放资源
                    fos.close();
                    fis.close();
    }
}
