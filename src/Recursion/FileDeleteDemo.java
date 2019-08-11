package Recursion;

import java.io.File;

/**
 * 需求：递归删除带内容的目录
 *
 * 目录：demo
 *
 * 分析：
 *      1、封装目录
 *      2、获取该目录所有文件或文件夹的File数组
 *      3、遍历，得到每一个File对象
 *      4、判断该File文件是否是文件夹
 *          是：回到B
 *          否：删除
 *
 *          xdy
 */
public class FileDeleteDemo {
    public static void main(String[] args) {
        File srcFolder = new File("/Users/Z/Download/xdy/未命名文件夹");
        deleteFolder(srcFolder);
    }

    private static void deleteFolder(File srcFolder){
        File[] fileArray = srcFolder.listFiles();
        for(File file: fileArray){
            if(file.isDirectory()){
                deleteFolder(file);
            }else{
                System.out.println(file.getName()+file.delete());
            }
        }
        System.out.println(srcFolder.getName()+"---"+srcFolder.delete());
    }
}
