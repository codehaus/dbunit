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

import java.util.Arrays;
import java.util.Collection;

/**
 * @author  rlogiacco
 */
public class Row {
	/**
	 * @uml.property  name="values"
	 */
	private Object[] values;

	/**
	 * @return
	 * @uml.property  name="values"
	 */
	public Iterable<Object> getValues() {
		return Arrays.asList(values);
	}

	public void setValues(Collection<Object> values) {
		this.values = values.toArray();
	}

	/**
	 * @param values
	 * @uml.property  name="values"
	 */
	public void setValues(Object[] values) {
		this.values = values;
	}

	/**
	 * @uml.property  name="table"
	 * @uml.associationEnd  inverse="rows:org.dbunit.Table"
	 */
	private Table table;

	/**
	 * Getter of the property <tt>table</tt>
	 * @return  Returns the table.
	 * @uml.property  name="table"
	 */
	public Table getTable() {
		return table;
	}

	/**
	 * Setter of the property <tt>table</tt>
	 * @param table  The table to set.
	 * @uml.property  name="table"
	 */
	public void setTable(Table table) {
		this.table = table;
	}
}
