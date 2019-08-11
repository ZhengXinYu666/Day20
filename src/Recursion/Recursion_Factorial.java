package Recursion;

/**
 * 需求：用代码实现求5的阶乘
 *  5！ = 1*2*3*4*5
 *  5! = 5*4!
 *
 *  方案：
 *      1、循环实现
 *      2、递归实现
 *          a：做递归要写一个方法
 *          b：出口条件
 *          c：规律
 */
public class Recursion_Factorial {
    public static void main(String[] args) {
        int jc = 1;
        for(int x = 2; x<=5; x++){
            jc *= x;
        }
        System.out.println("5的阶乘是："+jc);
        System.out.println(Factorial(5));
    }

    /**
     * 写一个方法：
     *   返回值类型：int
     *   参数列表：int n
     *
     * 出口条件：
     *    if(n == 1) {return 1;}
     * 规律：
     *      if(n != 1) {return n*方法名(n-1)}
     *
     */

    public static int Factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*Factorial(n-1);
        }
    }

}
