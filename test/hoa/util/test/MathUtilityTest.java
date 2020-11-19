/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoa.util.test;

import hoa.util.MathUtility;
import math.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qhoav
 */
public class MathUtilityTest {

    @Test // kí hiệu chơi với JUnit đưa ra, biến cái hàm thành hàm main
    //public static void manin(), app có nhiều main
    public void getFactorial_RunsWell_IfValidArgument() {
            assertEquals(120, MathUtility.getFactorial(5));
            assertEquals(1, MathUtility.getFactorial(0));
            assertEquals(720, MathUtility.getFactorial(6));
            assertEquals(1, MathUtility.getFactorial(1));
            assertEquals(12, MathUtility.getFactorial(5));
    }
    // viết code để test code 
    // viết code dùng thư viện JUnit,xUnit, Jasmine để test
    //xem code chính chạy ổn không trc khi đem cho khách hàng/QC
    //nếu màu đỏ k cho clean and build 
    //TDD viết code kèm với viết code test test driven development
}
