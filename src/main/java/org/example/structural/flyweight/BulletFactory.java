package org.example.structural.flyweight;

import org.example.behavioural.state.HasCoinState;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private static final Map<String,BulletType> pool = new HashMap();

    public static BulletType getBulletType(String sprite, String color){
//        String key = sprite+ "|" +

        return null;
    }

}
