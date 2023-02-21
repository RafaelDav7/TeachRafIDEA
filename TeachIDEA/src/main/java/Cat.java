public class Cat {
    String name;
    int age;

    public void meow() {
        System.out.printf("Meow!");
    }
    public int getAge() {
        return  age;
    }
    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
