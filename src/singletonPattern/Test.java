package singletonPattern;

public class Test {
    public static void main(String[] args){
        Singleton1 sq11 = Singleton1.getInstance();
        Singleton1 sq12 = Singleton1.getInstance();
        Singleton2 sq21 = Singleton2.getInstance();
        Singleton2 sq22 = Singleton2.getInstance();

        MultSingleton ms1 = MultSingleton.getInstance();
        MultSingleton ms2 = MultSingleton.getInstance();
        MultSingleton ms3 = MultSingleton.getInstance();
        MultSingleton ms4 = MultSingleton.getInstance();
        MultSingleton ms5 = MultSingleton.getInstance();
        MultSingleton ms6 = MultSingleton.getInstance();


        System.out.println(sq11==sq12);
        System.out.println(sq21==sq22);
        System.out.println(Singleton3.uniqueInstance.getClass());

        System.out.println(ms1==ms4);
        System.out.println(ms2==ms5);
        System.out.println(ms3==ms6);

    }
}
