package com.example.demo.Injector;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;

public class FieldInjectorReflectionAPI {

    public static void inject(Object target, Object dependency) throws Exception {
        for (Field field : target.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Autowired.class)) {
                field.setAccessible(true);
                field.set(target, dependency);
            }
        }
    }

}
