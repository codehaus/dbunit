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
package org.dbunit;

import java.sql.Connection;

/**
 * @author rlogiacco
 */
public class DataBaseTestCaseSupport {

	/**
	 * @uml.property  name="dialect"
	 * @uml.associationEnd  inverse="dataBaseTestCaseSupport:org.dbunit.Dialect"
	 */
	private Dialect dialect;

	/**
	 * Getter of the property <tt>dialect</tt>
	 * @return  Returns the dialect.
	 * @uml.property  name="dialect"
	 */
	public Dialect getDialect() {
		return dialect;
	}

	/**
	 * Setter of the property <tt>dialect</tt>
	 * @param dialect  The dialect to set.
	 * @uml.property  name="dialect"
	 */
	public void setDialect(Dialect dialect) {
		this.dialect = dialect;
	}

	/** 
	 * @uml.property name="connection"
	 * @uml.associationEnd inverse="dataBaseTestCaseSupport:java.sql.Connection"
	 */
	private Connection connection;

	/** 
	 * Getter of the property <tt>connection</tt>
	 * @return  Returns the connection.
	 * @uml.property  name="connection"
	 */
	public Connection getConnection() {
		return connection;
	}

	/** 
	 * Setter of the property <tt>connection</tt>
	 * @param connection  The connection to set.
	 * @uml.property  name="connection"
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	/**
	 * @uml.property  name="setUpOperation"
	 * @uml.associationEnd  inverse="dataBaseTestCaseSupport:org.dbunit.DatabaseOperation"
	 */
	private DatabaseOperation setUpOperation;

	/**
	 * Getter of the property <tt>setUpOperation</tt>
	 * @return  Returns the setUpOperation.
	 * @uml.property  name="setUpOperation"
	 */
	public DatabaseOperation getSetUpOperation() {
		return setUpOperation;
	}

	/**
	 * Setter of the property <tt>setUpOperation</tt>
	 * @param setUpOperation  The setUpOperation to set.
	 * @uml.property  name="setUpOperation"
	 */
	public void setSetUpOperation(DatabaseOperation setUpOperation) {
		this.setUpOperation = setUpOperation;
	}

	/**
	 * @uml.property  name="tearDownOperation"
	 * @uml.associationEnd  inverse="dataBaseTestCaseSupport:org.dbunit.DatabaseOperation"
	 */
	private DatabaseOperation tearDownOperation;

	/**
	 * Getter of the property <tt>tearDownOperation</tt>
	 * @return  Returns the tearDownOperation.
	 * @uml.property  name="tearDownOperation"
	 */
	public DatabaseOperation getTearDownOperation() {
		return tearDownOperation;
	}

	/**
	 * Setter of the property <tt>tearDownOperation</tt>
	 * @param tearDownOperation  The tearDownOperation to set.
	 * @uml.property  name="tearDownOperation"
	 */
	public void setTearDownOperation(DatabaseOperation tearDownOperation) {
		this.tearDownOperation = tearDownOperation;
	}

}
