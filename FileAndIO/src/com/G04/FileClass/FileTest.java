package com.G04.FileClass;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author G04
 * @Create 2024/4/21 14:41
 * @Version 1.0
 * ClassName: FileTest
 * Package: com.G04.FileClass
 * Description:
 */
public class FileTest {
    @Test
    public void test() {
        File f1 = new File("/Users/realtech/Desktop/file-demo");
        // 获取名称
        System.out.println(f1.getName());
        // 获取路径
        System.out.println(f1.getPath());
        // 获取绝对路径
        System.out.println(f1.getAbsolutePath());
        // 获取绝对路径表示的文件
        System.out.println(f1.getAbsoluteFile());
        // 获得上层文件目录路径，若无则返回null
        System.out.println(f1.getParent());
        // 获取文件长度
        System.out.println(f1.length());
        // 获取最后一次的修改时间
        System.out.println(f1.lastModified());
        System.out.println(Arrays.toString(f1.list()));
        System.out.println(Arrays.toString(f1.listFiles()));


    }


    @Test
    public void test2() throws IOException {

        for (int i = 0; i < 10; i++) {
            File file = new File("/Users/realtech/Desktop/file-demo/测试文件" + i + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
            }
        }
        // File file1 = new File("/Users/realtech/Desktop/file-demo/新文件1");
        // if (!file1.exists()) {
        //     System.out.println(file1.createNewFile());
        // }
        // file1.createNewFile("新文件1");

    }


    @Test
    public void test3() throws IOException {
        File file = new File("/Users/realtech/Desktop/file-demo/Hello.txt");
        System.out.println(file.getParent());

        File file1 = new File(file.getParent() + "/abc.txt");
        file1.createNewFile();

    }

    @Test
    public void test4() {
        File dir = new File("/Users/realtech/Desktop/测试用图片");
        String[] pic_list = dir.list();
        if (pic_list != null) {
            for (String item : pic_list) {
                if (item.endsWith(".jpg")) {
                    System.out.println(item);
                }
            }
        }

    }

    @Test
    public void test5() {

        File dir = new File("/Users/realtech/Desktop/测试用图片");
        String[] pic_list = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
    }

    @Test
    public void test6() {
        File dir = new File("/Users/realtech/Desktop/file-demo");
        // printFileName(dir);
        // deleteDirectory(dir, dir.getName());
        System.out.println(getDirectorySize(dir));

    }

    public void printFileName(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return !name.equals(".DS_Store");
                    }
                });
                if (listFiles != null) {
                    for (File listFile : listFiles) {
                        printFileName(listFile);
                    }
                } else {
                    System.out.println("该文件夹为空");
                }
            } else {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("文件不存在");

        }
    }

    public void deleteDirectory(File file, String file_name) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                assert listFiles != null;
                if (listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File listFile : listFiles) {
                    deleteDirectory(listFile, file_name);
                }
                if (!file.getName().equals(file_name)) {
                    file.delete();
                }
            } else {
                file.delete();
            }
        } else {
            System.out.println("文件不存在");

        }
    }

    public long getDirectorySize(File file) {
        long num = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return !name.equals(".DS_Store");
                    }
                });
                if (listFiles != null) {
                    for (File listFile : listFiles) {
                        num += getDirectorySize(listFile);
                    }
                } else {
                    System.out.println("该文件夹为空");
                }
            } else {
                System.out.println("文件名称：" + file.getName() + "，文件大小：" + file.length());
                num += file.length();
            }
        } else {
            System.out.println("文件不存在");
        }
        return num;
    }

}
