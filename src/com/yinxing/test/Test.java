package com.yinxing.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.BeforeClass;

public class Test {
	private static SessionFactory sf;

	@BeforeClass
	public static void beforeClass() {
		new SchemaExport(new AnnotationConfiguration().configure()).create(true,true);
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
//	@AfterClass
//	public static void afterClass(){
//		sf.close();
//	}
	
	@org.junit.Test
	public void test(){
		new SchemaExport(new AnnotationConfiguration().configure()).create(false,true);
	}
	
}


