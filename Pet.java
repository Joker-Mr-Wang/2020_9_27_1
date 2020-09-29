package cn.wang.seven.homework;
//宠物类
public class Pet {
    private String name;//姓名
    private int health;//健康值
    private int love;//亲密度

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health<0||health>100){
            System.out.println("健康值应该在0-100之间，默认值为60");
            this.health=60;
            return;}
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        if(love<0||love>100){
            System.out.println("亲密度应该在0-100之间，默认值是60");
            this.love=60;
            return;
        }
        this.love = love;
    }

    public void print(){
        System.out.println("宠物的自白：");
        //System.out.println("我的名字叫做"+getName()+"，我的健康值是"+getHealth()+"，我和主人的亲密度是"+getLove());
    }

}
