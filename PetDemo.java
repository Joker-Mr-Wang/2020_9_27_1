package cn.wang.seven.homework;

import java.util.Scanner;

public class PetDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎来到宠物店");
        //1.输入宠物姓名
        System.out.print("请输入要领养的宠物名字：");
        String name=input.next();
        //2.选择宠物类型
        System.out.print("请选择要领养的宠物类型：（1.狗狗  2.企鹅）");
        switch (input.nextInt()){
            case 1:
                //狗狗1
                //选择性别
                System.out.print("请选择狗狗的品种：（1.雪纳瑞  2.泰迪）");
                int StrainDog=input.nextInt();
                String straind="雪纳瑞";
                if(StrainDog==2){
                    straind="泰迪";
                }

                System.out.print("请输入狗狗的健康值（1-100之间）:");
                int healthd=input.nextInt();
                //创建狗狗对象
              Dog dog = new Dog();
                dog.setName(name);
                dog.setStrain(straind);
                dog.setHealth(healthd);
                dog.print();
                break;
            case 2:
                //企鹅
                //选择性别
                System.out.print("请选择企鹅的性别：（1.Q仔  2.Q妹）");
                int sexId=input.nextInt();
                String sex="Q妹";
                if(sexId==1){
                    sex="Q仔";
                }
                System.out.print("请输入企鹅的健康值（1-100之间）:");
                int health=input.nextInt();
                //创建企鹅对象
               Penguin pgn = new Penguin();
                pgn.setName(name);
                pgn.setSex(sex);
                pgn.setHealth(health);
                pgn.print();
                break;
        }


    }
}
