package src;

public class Bills {
    public int[] money = {50, 20, 5, 5, 1, 1, 1};  // ��ʼ������
    public Bills() {

    }
    public boolean isOk(int x) {  // �ж��ܷ�ɹ��ĺ���
        for (int i=0; i< money.length; i++) {  // �����ҴӴ�С����
            if (money[i]<x) {  // �����ǰ����Ŀ��С
                x = x - money[i];  // ��СĿ����
            }
            else if (money[i]==x) { // �����ǰ�����Ŀ����ͬ
                x = x - money[i];
                return true;  // �ɹ�
            }
            else {
                continue;
            }
        }
        return false;  // ʧ��
    }
}
