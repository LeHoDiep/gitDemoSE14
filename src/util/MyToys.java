/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Nomadic
 */
public class MyToys {
        //class này chứa các hàm tiện ích xài chung cho mọi dự án, noi nó sẽ là static
        //cF: compute Fatorial , tính giai thừa n!
    public static long cF(int n){
        if(n < 0 || n > 15)
               throw new IllegalArgumentException("n must be between 0...15");
        if(n == 0) return 1;
        long product = 1; //biến nhân dồn, gom, tích lũy, accumulation
        for(int i = 1; i<= n; i++){
            product *= i;
        }
        return product;
        
    }
}
