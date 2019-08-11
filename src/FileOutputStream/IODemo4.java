package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 加入异常处理的字节数处流操作
 */
public class IODemo4 {
    public static void main(String[] args){
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("fos3.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            fos.write("java".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //一起做异常处理
        //为了在finally中能够看到该对象就必须定义到外面，为了访问不出问题，必须给初始化值
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("fos3.txt");
            fos.write("java".getBytes());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //如果fos不是Null，才需要close
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
