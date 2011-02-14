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

import junit.framework.TestCase;

/**
 * @author   rlogiacco
 * @uml.dependency   supplier="org.dbunit.Assert"
 */
public class DataBaseTestCase extends TestCase {

	/**
	 * 
	 */
	public DataBaseTestCase() {
		super();
	}

	/**
	 * @param name
	 */
	public DataBaseTestCase(String name) {
		super(name);
	}

	/**
	 * @uml.property  name="dataBaseTestCaseSupport"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="dataBaseTestCase:org.dbunit.DataBaseTestCaseSupport"
	 */
	private DataBaseTestCaseSupport dataBaseTestCaseSupport = new org.dbunit.DataBaseTestCaseSupport();

	/**
	 * Getter of the property <tt>dataBaseTestCaseSupport</tt>
	 * @return  Returns the dataBaseTestCaseSupport.
	 * @uml.property  name="dataBaseTestCaseSupport"
	 */
	public DataBaseTestCaseSupport getDataBaseTestCaseSupport() {
		return dataBaseTestCaseSupport;
	}

	/**
	 * Setter of the property <tt>dataBaseTestCaseSupport</tt>
	 * @param dataBaseTestCaseSupport  The dataBaseTestCaseSupport to set.
	 * @uml.property  name="dataBaseTestCaseSupport"
	 */
	public void setDataBaseTestCaseSupport(
			DataBaseTestCaseSupport dataBaseTestCaseSupport) {
		this.dataBaseTestCaseSupport = dataBaseTestCaseSupport;
	}

}
