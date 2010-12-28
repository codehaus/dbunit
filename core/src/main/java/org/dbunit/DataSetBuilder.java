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

import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author rlogiacco
 * 
 */
public class DataSetBuilder extends DataSet {

	private Table current;

	public DataSetBuilder table(String name) {
		this.current = new Table();
		current.name = name;
		return this;
	}

	public DataSetBuilder cols(String... names) {
		if (current == null) {
			throw new RuntimeException("Invalid builder usage");
		}
		current.columns = new ArrayList<Column>(names.length);
		for (String name : names) {
			Column col = new Column();
			col.name = name;
			col.type = Types.NULL; // Column type is undefined
			current.columns.add(col);
		}
		current.rows = new ArrayList<Row>();
		return this;
	}
	
	public DataSetBuilder cols(Column... cols) {
		if (current == null) {
			throw new RuntimeException("Invalid builder usage");
		}
		current.columns.addAll(Arrays.asList(cols));
		current.rows = new ArrayList<Row>();
		return this;
	}

	public DataSetBuilder row(Object... values) {
		if (current == null || current.columns == null) {
			throw new RuntimeException("Invalid builder usage");
		}
		Row row = new Row();
		row.setValues(values);
		current.rows.add(row);
		return this;
	}
	
	public static Column col(String name, int type) {
		return new Column();
	}

}
