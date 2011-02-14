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

import java.util.ArrayList;
import java.util.List;

/**
 * @author rlogiacco
 * 
 */
public class Table {
	public class Metadata {

	}

	/**
	 * @uml.property name="name" readOnly="true"
	 */
	protected String name;

	/**
	 * @uml.property name="columns"
	 * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
	 *                     inverse="table:org.dbunit.Column"
	 */
	protected List<Column> columns = new ArrayList<Column>();

	/**
	 * @uml.property name="rows"
	 * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
	 *                     inverse="table:org.dbunit.Row"
	 */
	protected List<Row> rows = new ArrayList<Row>();

	/**
	 * Getter of the property <tt>name</tt>
	 * 
	 * @return Returns the name.
	 * @uml.property name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter of the property <tt>columns</tt>
	 * 
	 * @return Returns the columns.
	 * @uml.property name="columns"
	 */
	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * Setter of the property <tt>columns</tt>
	 * 
	 * @param columns
	 *            The columns to set.
	 * @uml.property name="columns"
	 */
	public void setColumns(List<Column> columns) {
		this.columns = columns;
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

	/**
	 * @uml.property name="schema"
	 * @uml.associationEnd inverse="tables:org.dbunit.Schema"
	 */
	private Schema schema;

	/**
	 * Getter of the property <tt>schema</tt>
	 * 
	 * @return Returns the schema.
	 * @uml.property name="schema"
	 */
	public Schema getSchema() {
		return schema;
	}

	/**
	 * Setter of the property <tt>schema</tt>
	 * 
	 * @param schema
	 *            The schema to set.
	 * @uml.property name="schema"
	 */
	public void setSchema(Schema schema) {
		this.schema = schema;
	}

}
