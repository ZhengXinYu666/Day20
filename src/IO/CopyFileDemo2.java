package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
        public static void main(String[] args) throws IOException {
            FileInputStream fis = new FileInputStream("/Users/Z/DeskTop/网络基础1.pdf");

            FileOutputStream fos = new FileOutputStream("/Users/Z/DeskTop/Demo/网络基础第一章.pdf");

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
