package sxkeji.net.dailydiary.utils;

import android.text.TextUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by renbingwu on 2015/11/20.
 */
public class MapUtils {
    private Map<String,String> map;
    private MapUtils(Map<String, String> map){
        this.map = map;
    }
    public static MapUtils builder(Map<String,String> map){
        return new MapUtils(map);
    }
    public Map<String, String> checkEmptyMap(Map<String, String> map) {
        HashMap<String, String> resultMap = new HashMap<>();
        for (String key :
                map.keySet()) {
            String vaule = map.get(key);
            if (!TextUtils.isEmpty(vaule)) {
                resultMap.put(key, vaule);
            }
        }
        return resultMap;
    }
    public MapUtils put(String key,String value){
        if(!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && map != null){
            map.put(key,value);
        }
        return this;
    }
}
