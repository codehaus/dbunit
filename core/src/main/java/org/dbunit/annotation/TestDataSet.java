/*
 * The dbUnit Database Testing Framework
 * Copyright (C)2002-2004, DbUnit.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.dbunit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Driver;

import org.dbunit.Format;

/**
 * @author rlogiacco
 *
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestDataSet {

	/**
	 * @author rlogiacco
	 *
	 */
	public enum Type {
		FILE, URL, JDBC, JNDI;
	}

	String value();
	
	String username() default "";
	
	String password() default "";

	Format format() default Format.XML;
	
	Filter[] filters() default {};

	boolean streamed() default false;
	
	Type type() default Type.FILE;
	
	Class<? extends Driver> driver() default Driver.class;
	
	@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Composite {
		TestDataSet[] value();
		
		Operation type() default Operation.JOIN;
		
		public static enum Operation {
			JOIN, SUBTRACT, INTERSECT;
		}
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filter {

		String query() default "SELECT * FROM *";

		Replace[] replace() default {};

	}
	
	/**
	 * @author rlogiacco
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Replace {
		final static String NULL = "";
		
		String orig();

		String target();

	}
}
