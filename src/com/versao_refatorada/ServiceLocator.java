package com.versao_refatorada;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static final Map<Class<?>, Object> services = new HashMap<>();

    public static <T> void register(Class<T> clazz, T service) {
        services.put(clazz, service);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> T get(Class<T> clazz) {
        return (T) services.get(clazz);
    }
}