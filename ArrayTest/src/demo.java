//步骤一：导包
//步骤二：提供或创建一个Scanner类的实例
//调用Scanner类的方法，获取指定类型的变量
//关闭资源，调用Scanner类的关闭方法

class PrimiseTest {
    public static void main(String[] args) {
//    一百以内所有的质数
//        也就是只要在1到他本身之间，都无法做到%为0，就满足
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i <= 1000000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时" + (endTime - startTime));
        System.out.println("总共" + count + "个");

    }

}