package chenpeiqi.lab1;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Test {
//    public static Object getclass(String className)
//    {
//        Class clz = Class.forName(className);
//        Constructor constructor = clz.getDeclaredConstructor(String.class);
//        Object instance = constructor.newInstance();
//        return instance;
//    }

    public static void main(String[] args){

//        List<Computer> comList = new ArrayList<>();
//        ComputerStore store = new ComputerStore(comList);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input Computer numbers:");
//        int num = sc.nextInt();
//        for(int i=0; i< num; i++){
//            System.out.println("Input Computername:");
//            String computerName = sc.nextLine();
//            System.out.println("This computer has 4 or 3 parts: ");
//            int part = sc.nextInt();
//            System.out.println("Input the brand of every part in this order：CPU RAM Disk Mainboard:\n");
//            String p1 = sc.nextLine();
//            String p2 = sc.nextLine();
//            String p3 = sc.nextLine();
//            Object o1,o2,o3;
//            o1 = getclass(p1);
//            o2 = getclass(p2);
//            o3 = getclass(p3);
//            if(part==4){
//                String p4 = sc.nextLine();
//                Object o4;
//                o4  =getclass(p4);
//                comList.add(new Computer(computerName,o1,o2,o3,o4));
//            }else{
//                comList.add(new Computer(computerName,o1,o2,o3));
//            }
//        }






        CPU intel = new Intel();
        RAM samsung = new Samsung();
        Disk seagate = new Seagate();
        Mainboard asus = new Asus();

        Computer cm1 = new Computer("com1",intel,samsung,seagate,asus);
        Computer cm2 = new Computer("com2",intel,seagate,asus);
        Computer cm3 = new Computer("com3",intel,samsung,seagate,asus);
        Computer cm4 = new Computer("com4",intel,samsung,seagate,asus);


        List<Computer> comList = new ArrayList<>();
        comList.add(cm1);
        comList.add(cm2);
        comList.add(cm3);
        comList.add(cm4);
        ComputerStore store1 = new ComputerStore(comList);

        intel.work();
        samsung.work();
        seagate.work();
        asus.work();

        store1.getStoreInfo();


    }
}
