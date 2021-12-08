package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
