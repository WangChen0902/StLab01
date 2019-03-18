package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import src.Bills;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class BillsTest {
    private Bills bill;
    private int input;

    public BillsTest(int input) {
        this.input = input;
    }

    @Before
    public void setUp() {
        bill = new Bills();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {66}, {50}, {0}, {11}  // ��������
        });
    }

    @Test  // �ж��Ƿ�ɹ�
    public void TestisOk() {
        assertTrue(bill.isOk(input));
    }
}