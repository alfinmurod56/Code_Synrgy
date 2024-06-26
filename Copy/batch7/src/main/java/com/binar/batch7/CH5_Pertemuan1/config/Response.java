package com.binar.batch7.CH5_Pertemuan1.config;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Response {

    public static Map sukses(Object obj) {
        Map map = new HashMap();
        map.put("data", obj);
        map.put("status", 200);
        map.put("message", "Success");
        return map;
    }

    public Map error(Object obj, Object code) {
        Map map = new HashMap();
        map.put("status", code);
        map.put("message", obj);
        return map;
    }

    public boolean chekNull(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

}