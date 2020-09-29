package cn.wang.seven.homework;

public class Dog extends Pet {
    String strain;//品种

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);

        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
@Override
    public void print(){
    super.print();
        System.out.println("我的名字叫做"+getName()+"，我的健康值是"+getHealth()+"，我和主人的亲密度是"+getLove()+"我是一只"+getStrain());
    }
}
