public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Hasan",30);
        System.out.println("Hello World!");
        p1.showOutput();
    }
}

class Person{
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