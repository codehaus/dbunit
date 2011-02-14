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
import java.util.ArrayList;
import java.util.List;

/**
 * @author rlogiacco
 * 
 */
public class DataSet {

	/**
	 * @uml.property name="schemas"
	 * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
	 *                     inverse="dataSet:org.dbunit.Schema"
	 */
	private List<Schema> schemas = new ArrayList<Schema>();

	/**
	 * @uml.property name="rows"
	 * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
	 *                     inverse="dataSet:org.dbunit.Row"
	 */
	private List<Row> rows = new ArrayList<Row>();

	/**
	 * Getter of the property <tt>schemas</tt>
	 * 
	 * @return Returns the schemas.
	 * @uml.property name="schemas"
	 */
	public List<Schema> getSchemas() {
		return schemas;
	}

	/**
	 * Setter of the property <tt>schemas</tt>
	 * 
	 * @param schemas
	 *            The schemas to set.
	 * @uml.property name="schemas"
	 */
	public void setSchemas(List<Schema> schemas) {
		this.schemas = schemas;
	}

	/**
	 * Getter of the property <tt>rows</tt>
	 * 
	 * @return Returns the rows.
	 * @uml.property name="rows"
	 */
	public List<Row> getRows() {
		return rows;
	}

	/**
	 * Setter of the property <tt>rows</tt>
	 * 
	 * @param rows
	 *            The rows to set.
	 * @uml.property name="rows"
	 */
	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public static DataSet merge(DataSet... dataSets) {
		return null;
	}

	public static DataSet subtract(DataSet... dataSets) {
		return null;
	}

	public static DataSet intersect(DataSet... dataSets) {
		return null;
	}
	
	public static DataSet query(Connection connection, String query) {
		return null;
	}
	
	public static DataSet queryTables(Connection connection, String... tables) {
		return null;
	}
}
