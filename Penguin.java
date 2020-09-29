package cn.wang.seven.homework;

public class Penguin extends Pet {
    String sex;//性别

    public Penguin(String sex) {
        this.sex = sex;
    }

    public Penguin() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void print(){
        super.print();
        System.out.println("我的名字叫做"+getName()+"，我的健康值是"+getHealth()+"，我和主人的亲密度是"+getLove()+"我的性别是"+getSex());
    }
}
