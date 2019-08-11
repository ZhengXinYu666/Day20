package Recursion;

import java.io.File;

/**
 * 遍历文件
 * 输出DeskTop目录下所有的.avi文件的路径输出在控制台
 *
 * 分析：
 *      A、封装目录
 *      B、获取该目录下的所有文件或者文件夹的File数组
 *      C、遍历该File数组，得到每一个File对象
 *      D、判断是否为文件夹
 *          是：回到B
 *          否：继续判断是以.avi结尾
 *              是：输出绝对路径
 *              否：不搭理
 *
 *              /Users/Z/DeskTop
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        //封装目录
        File srcFolder = new File("/Users/Z/DeskTop");

        //递归功能实现
        getAllFilePaths(srcFolder);
    }

    private static void getAllFilePaths(File srcFolder){
        //获取该目录下的所有文件或者文件夹的File数组
        File[] fileArray = srcFolder.listFiles();

        //遍历File数组，得到每一个File对象
        for(File file:fileArray){
            if(file.isDirectory()){
                getAllFilePaths(file);
            }else{
                if(file.getName().endsWith(".avi")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
