public class Person{
    private final String name;
    private final int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void showOutput() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}