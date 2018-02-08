package com.capacity.source.utils;

import java.util.UUID;

/**
 * Created by 俗人 on 2018/2/4.
 */
public class CommonUtils {

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
