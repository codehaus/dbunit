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

import java.util.List;

/**
 * @author rlogiacco
 */
public class Schema {

	/**
	 * @uml.property name="name"
	 */
	private String name;
	/**
	 * @uml.property name="tables"
	 * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
	 *                     inverse="schema:org.dbunit.Table"
	 */
	private List<Table> tables = new java.util.ArrayList<Table>();

	/**
	 * Getter of the property <tt>name</tt>
	 * 
	 * @return Returns the schema name.
	 * @uml.property name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * 
	 * @param schema
	 *            The schema name to set.
	 * @uml.property name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of the property <tt>tables</tt>
	 * 
	 * @return Returns the tables.
	 * @uml.property name="tables"
	 */
	public List<Table> getTables() {
		return tables;
	}

	/**
	 * Setter of the property <tt>tables</tt>
	 * 
	 * @param tables
	 *            The tables to set.
	 * @uml.property name="tables"
	 */
	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

}
