package cn.wang.two;
/**
 *猜数字游戏
 */
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);//定义一个0-1的随机数字
        System.out.println("我心里有一个0-99之间的整数，你猜是什么？");
        Scanner input = new Scanner(System.in);//键盘输入数字
        //System.out.println(num1);
        boolean kaiGuan = true;//定义bool类型变量
        int i = 1;//定义一个变量用于统计输出次数
        while (kaiGuan)//当kaiGuan为真时，进入循环
        {
            int num2 = input.nextInt();

            if (num2 > num1) {//当输出数大时输出：大了点，再猜！
                i++;
                System.out.println("大了点，再猜！");
            }
            else if (num2 < num1) {//当输出数小时输出：小了点，再猜！
                System.out.println("小了点，再猜！");
                i++;
            }
            else {//当输出数正确时输出
                kaiGuan = false;//变量为0时，循环结束
                System.out.println("猜对了");
                //i = i;//得到猜数次数
            }
        }
    }

    public void num(int i){
        if (i == 1) {//根据猜数次数得出不同结果
            System.out.println("你太聪明了！");//i=1
        }
        else if (i >= 2 && i < 5) {
            System.out.println("不错，再接再厉！");//i=（2，5）
        }
        else {
            System.out.println("要努力啊！");//i>5
        }
    }
}
