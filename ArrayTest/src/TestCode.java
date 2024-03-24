
import java.util.Random;
import java.util.Scanner;

public class TestCode {
    /**
     * @param args int
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // 定义数组,准备的5个红包
        int[] redpackArr = {9, 666, 188, 520, 99999};
        // 抽过的红包
        boolean[] selectedArr = new boolean[5];
        int count = 0;
        while (count < 5) {
            System.out.println("请按任意键抽奖:");
            sc.next();
            // 获得一个0-4之间的数作为索引
            int moneyIndex = random.nextInt(5);
            if (!selectedArr[moneyIndex]) {
                // 如果没有被抽取过, 标记为已抽取
                selectedArr[moneyIndex] = true;
                count++;
                System.out.println("恭喜中奖");
            } else {
                System.out.println("该奖品没了,请重新抽取");
                String[] stringList = new String[]{
                        "a", "b"
                };
            }
        }
    }
}