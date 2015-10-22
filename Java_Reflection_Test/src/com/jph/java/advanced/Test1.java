package com.jph.java.advanced;

import java.lang.reflect.Constructor;

import com.jph.test.Child;

/**
 * ���� Class �Լ��������
 * issue:
 * 1.�����ȡ����ķ���������
 * 2.�������������������������Ϥ�ͷ���
 * 
 * @author Penn
 */
public class Test1 {
	public static String string="haha";
	public static void main(String[] args) {
//		classForName();
		Child child=new Child();
		child.call("dd");
	}

	/**
	 * ͨ�� Class ������Ŀ�����͵Ķ���
	 */
	private static void classForName() {
		try {
			// ��ȡ Class ����
			Class<?> clz = Class.forName("com.jph.study.Person");
			// ͨ�� Class �����ȡ Constructor��Student �Ĺ��캯����һ���ַ�������
			// ���������Ҫ���ݲ��������� ( Student �������Ĵ��� )
			Constructor<?> constructor = clz.getConstructor(String.class);
			// ͨ�� Constructor ������ Student ����
			Object obj = constructor.newInstance("С��");
			Person p = (Person) obj;
			System.out.println(" obj :  " + p.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
