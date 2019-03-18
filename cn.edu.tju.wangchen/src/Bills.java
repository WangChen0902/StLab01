package src;

public class Bills {
    public int[] money = {50, 20, 5, 5, 1, 1, 1};  // 初始化货币
    public Bills() {

    }
    public boolean isOk(int x) {  // 判断能否成功的函数
        for (int i=0; i< money.length; i++) {  // 将货币从大到小遍历
            if (money[i]<x) {  // 如果当前金额比目标小
                x = x - money[i];  // 减小目标金额
            }
            else if (money[i]==x) { // 如果当前金额与目标相同
                x = x - money[i];
                return true;  // 成功
            }
            else {
                continue;
            }
        }
        return false;  // 失败
    }
}
