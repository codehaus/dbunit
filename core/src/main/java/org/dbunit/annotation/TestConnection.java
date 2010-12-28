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

import org.dbunit.DatabaseOperation;

/**
 * @author rlogiacco
 * 
 */
@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TestConnection {

	/**
	 * @author rlogiacco
	 * 
	 */
	public enum Type {
		JDBC, JNDI;
	}

	public String url();

	public Type type();

	public String username() default "";

	public String password() default "";

	public DatabaseOperation setUp() default DatabaseOperation.CLEAN_INSERT;

	public DatabaseOperation tearDown() default DatabaseOperation.NONE;

	public enum DatabaseOperation {
		NONE(org.dbunit.DatabaseOperation.NONE), 
		CLEAN_INSERT(org.dbunit.DatabaseOperation.CLEAN_INSERT), 
		UPDATE(org.dbunit.DatabaseOperation.UPDATE), 
		INSERT(org.dbunit.DatabaseOperation.INSERT), 
		DELETE(org.dbunit.DatabaseOperation.DELETE), 
		DELETE_ALL(org.dbunit.DatabaseOperation.DELETE_ALL), 
		TRUNCATE(org.dbunit.DatabaseOperation.TRUNCATE), 
		REFRESH(org.dbunit.DatabaseOperation.REFRESH);

		private org.dbunit.DatabaseOperation type;

		private DatabaseOperation(org.dbunit.DatabaseOperation type) {
			this.type = type;
		}

		/**
		 * @return
		 */
		public org.dbunit.DatabaseOperation getType() {
			return type;
		}
	}
}
