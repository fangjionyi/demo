package net.togogo.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-10-03
 * Time: 16:02
 */
public class User {
    private int age;
    private String name;
    private String sex;
    private String ddddd;

    public User() {
    }

    public User(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }


    public int getAge() {
        System.out.println("我是一个日志")；
        return age;
    }

    public void setAge(int age) {
        int num=123+123;

        this.age = age;
    }

    public String getName() {
        
       System.out.println("我是一个日志")；
        
        return name;
    }

    public void setName(String name) {

        int num2=322+21223;

        this.name = name;
    }

    public String getSex() {
        System.out.println("我也是一个日志");
        return sex;
    }

    public void setSex(String sex) {
        int num=32;


        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
