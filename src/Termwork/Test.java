abstract class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
    abstract void show();
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
    void show() {
        System.out.println("Child Show");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
