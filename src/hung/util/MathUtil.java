/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.util;

/**
 *
 * @author ASUS
 */
//Đây là class chứa các hàm tính toán,toán học ,dùng chung,làm tiện ích
//cho các nơi khác sử dụng.Phàm cái gì mà mang tính chất xài chung
//ta dùng kỹ thuật STATIC
public class MathUtil {
    
    //hàm tính n! = 1.2.3..n
    //vì giá trị giai thừa tăng cực nhanh, nên sẽ tràn vùng int rất sớm
    //do int chỉ tối đa 2 tỷ 1, nên ta xài long thì mới chứa dc n lớn
    //nhưng cũng chỉ cỡ 15! thoy.
    public static long computeFactorial(int n){
        
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    
}
