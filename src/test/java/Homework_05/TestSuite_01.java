package Homework_05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class TestSuite_01 {

    @Test
    public  void test1(){
        TestMethod_01 test = new TestMethod_01();
        int output = test.getFactorial(5,1,1);
        assertEquals(120,output,0);
    }
    @Test
    public void test2(){
        TestMethod_01 test2 = new TestMethod_01();
        int output2 = test2.longS("dsadasdasd");
        assertEquals(3,output2,0);
    }
    @Test
    public void test3(){
        TestMethod_01 test3 = new TestMethod_01();
        boolean output3 = test3.onlyDigits("1234g",4);
        assertEquals(true,output3);
    }
}
