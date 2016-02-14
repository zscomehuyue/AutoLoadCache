package com.test;

import com.jarvis.cache.CacheUtil;

public class SpELTest {

    public static void main(String[] args) {
        String keySpEL="'test.'+#hash(#args)";
        Object[] arguments=new Object[]{"1111", "2222"};

        String res=CacheUtil.getDefinedCacheKey(keySpEL, arguments, null);
        System.out.println(res);
    }

}
