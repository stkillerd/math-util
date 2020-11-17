/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoa.util;

/**
 *
 * @author qhoav
 */
public class MathUtility {
    //làm hàm fake giống hàm thật
    //jdk có class java.util.math. có 1 loạt hàm static
    public static final double PI = 3.1415;
    
    //n! tăng nhanh, nên mình chỉ tính 20! tối đa, 21! tràn long
    //0! = 1! = 1; k có âm giai thừa, nếu tham số n là âm, mình đưa ra exception
    public static long getFactorial(int x){
        if(x <0 || x > 20)
            throw new IllegalArgumentException("n must be betwwen 1..20");
        long result = 1;
        if(x == 1 || x == 0)
            return 1;
        //đến đây tức là n = 2...20
        for (int i = 2; i <= x; i++) {
            result *=i;
        }
        return result;
    }
}
