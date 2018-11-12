package exercices;

public class Person {

    private String name;
    private int age;
    private boolean wilder;

    public Constructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public boolean getWilder(){
        return wilder;
    }

    public void setWilder(boolean wilder){
        this.wilder = wilder;
    }

    public whoAmI(String name, int age){
        Constructor(name, age);
        return "My name is " + this.name + " and i'm " + this.age;
    }

    public Person() {
    }
}

