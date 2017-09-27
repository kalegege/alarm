package com.wasu.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

/**
 * Created by kale on 2017/9/27.
 */
public abstract class DbCache<T, V> {
    /**/
    private LoadingCache<T, V> cache;

    /**/
    private static Long cacheSize = 10000L;

    /**/
    private static Long expireTime = 600L;

    /**/
    protected abstract V fetch(T key);

    /**
     * 从cache中取出缓存
     * @param key
     * @return
     */
    public V get(T key) {
        if (key == null)
            return null;
        try {
            initCache();
            return cache.get(key);
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * 存入缓存
     */
    public void put(T key, V value) {
        initCache();
        cache.put(key, value);
    }

    /**
     * 初始化cache
     */
    public void initCache() {
        if (cache == null) {
            cache = CacheBuilder.newBuilder().maximumSize(cacheSize).expireAfterWrite(expireTime, TimeUnit.SECONDS)
                    .build(new CacheLoader<T, V>() {
                        @Override
                        public V load(T key) throws Exception {
                            return fetch(key);
                        }
                    });
        }
    }

    /**
     * 清除指定key的缓存
     * @param key
     */
    public void clear(T key) {
        if (cache == null)
            return;
        cache.invalidate(key);
    }

    /**
     * 清除所有缓存
     */
    public void clearAll() {
        if (cache == null)
            return;
        cache.invalidateAll();
    }
}
