/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author PC
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5); //hàm tính đi coi được mấy
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));

        System.out.println("expected: 0! = 1;   actual: " + MathUtil.getFactorial(0));

        //MathUtil.getFactorial(-5); //ném ngoại lệ thật rồi, ai biểu đưa cà chớn chi
        
        //===========================================================================
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CIDE LÊN SERVER 9:28PM 20/3/2024
        System.out.println("expected: 1! = 1;   actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 720;   actual: " + MathUtil.getFactorial(6));
        
        //===========================================================================
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CIDE LÊN SERVER 11:12PM 22/3/2024
        System.out.println("expected: 9! = 362880;   actual: " + MathUtil.getFactorial(9));
        System.out.println("expected: 10! = 3628800;   actual: " + MathUtil.getFactorial(10));

        //===========================================================================
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CIDE LÊN SERVER 10:53PM 24/3/2024
        System.out.println("expected: 11! = --------;   actual: " + MathUtil.getFactorial(11));
        
        //===========================================================================
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CIDE LÊN SERVER 10:56PM 25/3/2024
        System.out.println("expected: 12! = --------;   actual: " + MathUtil.getFactorial(12));
        
        //===========================================================================
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CIDE LÊN SERVER 10:42PM 26/3/2024
        System.out.println("expected: 13! = --------;   actual: " + MathUtil.getFactorial(13));
        
        //===========================================================================
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //mày chạy thực tế hay Hàm ai đó viết thực tế là mấy = actual, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
    }
    
}
