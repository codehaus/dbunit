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
public class FilteredDataSet extends DataSet {

	/**
	 * @uml.property  name="filters"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="filteredDataSet:org.dbunit.Filter"
	 */
	private List<Filter> filters = new java.util.ArrayList();

	/**
	 * Getter of the property <tt>filters</tt>
	 * @return  Returns the filters.
	 * @uml.property  name="filters"
	 */
	public List<Filter> getFilters() {
		return filters;
	}

	/**
	 * Setter of the property <tt>filters</tt>
	 * @param filters  The filters to set.
	 * @uml.property  name="filters"
	 */
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

}
