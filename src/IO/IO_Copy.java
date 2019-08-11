package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制一个文件
 *
 * 数据源：从哪里来
 * a.txt----读取数据----FileInputStream
 *
 * 目的地：到哪里去
 * b.txt---写数据---FileOutputStream
 */
public class IO_Copy {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("a.txt");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("b.txt");

        //从数据源读取数据
        int by = 0;
        while((by = fis.read())!= -1){
            fos.write(by);
        }
        //释放资源(先关谁都行）
        fis.close();
        fos.close();
    }
}
