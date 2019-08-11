package FileInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流操作步骤：
 *  A、创建字节输入流对象
 *  B、调用read方法读取数据，并把数据显示在控制台
 *  C、释放资源
 *
 * 一次读取一个字节数组：int read(byte[] b)
 * 返回值是实际读取的字节个数
 */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        //读取数据
        //第一次读取
//        byte[] bys = new byte[5];
//        int len = fis.read(bys);
//        System.out.println(new String(bys,0,len));
//
//        //第二次读取
//         len = fis.read(bys);
//        System.out.println(new String(bys,0,len));
        //循环改进 ---不知道结束条件
//        byte[] bys = new byte[10];
//        int len = 0;
//        while((len=fis.read(bys))!= -1){
//            System.out.print(new String(bys,0,len));
//            //注意千万要带上len的使用
//        }
        //最终版：数组长度一般是1024或者1024的整数倍
        byte[] bys = new byte[1024];//相当于1k的数据
        int len = 0;
        while ((len=fis.read())!= -1){
            System.out.print(new String(bys,0,len));
        }

        //释放资源
        fis.close();
    }
}
