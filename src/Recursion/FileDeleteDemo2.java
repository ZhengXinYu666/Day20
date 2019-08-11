package Recursion;

import java.io.File;

/**
 * 需求：递归删除带内容的目录
 *
 * 分析：
 *  A、封装目录
 *  B、获取该目录下所有的File数组
 *  C、遍历数组，得到每一个File对象
 *  D、判断File对象是否是文件夹
 *      是：回到B
 *      否：删除
 *
 */
public class FileDeleteDemo2 {
    public static void main(String[] args) {
        //封装目录
        File srcFolder = new File("xdy");
        //递归实现
    }
    private static void deleteFolder(File srcFolder){

    }
}
