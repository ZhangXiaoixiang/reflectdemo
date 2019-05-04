package com.demo;

import java.lang.reflect.Field;

/**
 * 万能的setXxx()方法,当然getXxx()也行
 */
public class PropertyUtil {
	// per.setXxx(value); private String name;
	public static void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<? > clazz = obj.getClass() ;
		Field field = clazz.getDeclaredField( propertyName) ;
		field.setAccessible(true);
		field.set(obj, value);
	}
}
