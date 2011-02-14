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

import static org.dbunit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.Driver;

import org.dbunit.DataSet;
import org.dbunit.DataSetFactory;
import org.dbunit.Dialect;
import org.dbunit.Format;
import org.dbunit.annotation.TestConnection.DatabaseOperation;
import org.dbunit.annotation.TestDataSet.Filter;
import org.dbunit.annotation.TestDataSet.Replace;
import org.junit.Test;

/**
 * @author rlogiacco
 * 
 */
// Initialization dataset
@TestDataSet(value = "invoice.xml", format = Format.FLAT_XML)
public class UsageExample {

	@TestConnection(url = "jdbc:", type = TestConnection.Type.JDBC, username = "sa", password = "", setUp = DatabaseOperation.CLEAN_INSERT, tearDown = DatabaseOperation.NONE)
	public Connection connection;

	@Test
	@TestDataSet("http://www.dbunit.org/users.xml")
	public void singleURLDataSet(
			@TestDataSet("http://www.dbunit.org/users.xml") DataSet expected)
			throws Exception {
		DataSet actual = DataSet.query(connection, "PIPPO");
		assertEquals(expected, actual);
	}

	@Test
	@TestDataSet(value = "http://www.dbunit.org/users.xml", format = Format.XML)
	public void singleURLDataSetWithFormat() {

	}

	@Test
	@TestDataSet.Composite({
			@TestDataSet("http://www.dbunit.org/users.xml"),
			@TestDataSet(value = "file://test/orders.xml", format = Format.FLAT_XML) })
	public void multipleURLDataSetWithSameFormat() {

	}

	@Test
	@TestDataSet.Composite({
			@TestDataSet(value = "http://www.dbunit.org/users.xml", format = Format.FLAT_XML),
			@TestDataSet(value = "file://test/orders.csv", format = Format.CSV) })
	public void multipleURLDataSetWithDifferentFormat() {

	}

	@TestDataSet(value = "http://www.dbunit.org/users.xml", filters = @Filter(query = "FROM USERS WHERE ID < 5"))
	public void filteredDataSet() {

	}

	@TestDataSet(value = "http://www.dbunit.org/users.xml", streamed = true, filters = @Filter(replace = @Replace(orig = "<null>", target = Replace.NULL)))
	public void streamedDataSetWithReplacement() {

	}

	public void inlineDataSet() {

	}

	@TestDataSet(value = "", username = "", password = "", type = TestDataSet.Type.JNDI, driver = Driver.class)
	public void connectionDataSet() {

	}

	@TestDataSet(value = "jdbc:oracle10://localhost/", type = TestDataSet.Type.JDBC, driver = Driver.class, filters = {
			@Filter(query = "SELECT * FROM GROUPS", replace = @Replace(orig = "<null>", target = Replace.NULL)),
			@Filter(query = "SELECT * FROM USERS") })
	public void connectionDataSetWithFilter(DataSet expected) {
		// do something

		// read actual data
		DataSet actual = null; // connection.createDataSet("");

		// perform assertions
		assertEquals(expected, actual);
	}

	@TestDataSet(value = "", type = TestDataSet.Type.JDBC, driver = Driver.class, filters = @TestDataSet.Filter(query = "SELECT * FROM *"))
	public static DataSet dataSet;
}