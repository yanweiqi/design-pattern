package com.behavioral.command.second;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Command {
	
	private Object   receiver;
	private Method   method;
	private Object[] parameters;
	
	/**
	 * 创建一个新的实例 Command.   
	 * @param Object   
	 * @param methodName
	 * @param parameters
	 */
	public Command(Object obj, String methodName, Object[] parameters) {
		this.receiver  = obj;
		this.parameters = parameters;
		Class<?> clazz = obj.getClass();
		Class<?>[] clazzs = new Class<?>[parameters.length];
		
		for (int i = 0; i < parameters.length; i++) {
			clazzs[i] = parameters[i].getClass();
		}
			
		try {
			method = clazz.getMethod(methodName, clazzs);
		}
		catch (NoSuchMethodException e) {
			System.out.println(e);
		}
	}
	
	public Object execute() {
		try {
			return method.invoke(receiver, parameters);
		}
		catch (IllegalAccessException e) {
			System.out.println(e);
		}
		catch (InvocationTargetException e) {
			System.out.println(e);
		}
		return null;
	}
}
