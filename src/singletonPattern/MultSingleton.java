package singletonPattern;

import java.util.HashMap;
import java.util.Map;

public class MultSingleton {
    private final static String DEFAULT_PREKEY = "Cache";
    private static Map<String, MultSingleton> map = new HashMap<>();
    private final static int MAX_NUM = 3;
    private static int num = 1;

    private MultSingleton(){}

    public static MultSingleton getInstance(){
        String key = DEFAULT_PREKEY+num;
        MultSingleton ms = map.get(key);
        if (ms == null) {
            ms = new MultSingleton();
            map.put(key, ms);
        }
        num++;
        if(num > MAX_NUM){
            num = 1;
        }
        return ms;
    }
}
