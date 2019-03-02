package singletonPattern;

public class Singleton2 {

    private static class SingletonHolder{
        private static Singleton2 instance = new Singleton2();
    }


    private Singleton2(){
        //TODO auto-generated constructor stub
    }
    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }
}
