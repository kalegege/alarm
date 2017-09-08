package com.wasu.utils;

/**
 * Created by kale on 2017/8/22.
 */
public class DataSourceContextHolder {
    private static final ThreadLocal contextHolder = new ThreadLocal();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return (String) contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }

}
