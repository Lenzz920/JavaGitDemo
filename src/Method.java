public class Method {

    private int age;
    private String name;

    public Method(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void hello (int age, String name) {
        System.out.println("Hello, my name is " + this.name + " and I'm " + this.age + " years old. Nice to meet you!");
    }
}
