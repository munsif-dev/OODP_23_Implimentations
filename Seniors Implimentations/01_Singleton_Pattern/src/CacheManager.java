import java.util.HashMap;
import java.util.Map;
public class CacheManager {
    private Map<String, Object> cache;
    private CacheManager() {

        cache = new HashMap<>();
    }
    private static CacheManager instance;
    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    public void addToCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getFromCache(String key) {
        return cache.get(key);
    }
}
