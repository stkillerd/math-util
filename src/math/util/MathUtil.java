/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import hoa.util.MathUtility;

/**
 *
 * @author qhoav
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = "  + MathUtility.getFactorial(5));
        //gọi hàm tính 5! hy vọng hàm trả về 120
        //lát hàm chạy. coi thực tế là mấy ACTUAL
        //so sánh voies cái hi vọng trc khi tính EXPECTED 120
        // ACTUAL=EXPECTED hàm chạy đúng cho tình huống này. TEST CASE náyout   
        System.out.println("0! = " + MathUtility.getFactorial(0));
        //expected 1, actual chạy mới biết
        //chạy xong mới biết hàm đúng sai
        System.out.println("-5! " + MathUtility.getFactorial(-5));
        // expected show ILLEGALLARGUMENTEXEPTION
        
        //dùng màu để xem test. gọi là automation
    }
    
}
