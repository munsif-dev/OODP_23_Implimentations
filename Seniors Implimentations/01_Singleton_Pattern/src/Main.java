import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CacheManager cacheManager = CacheManager.getInstance();
        cacheManager.addToCache("key1", "value1");
        Object cachedValue = cacheManager.getFromCache("key1");
        System.out.println(cachedValue);

    }
}