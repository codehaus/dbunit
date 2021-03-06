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
 */
public class CompositeDataSet extends DataSet {

	/**
	 * @uml.property  name="dataSets"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="compositeDataSet:org.dbunit.DataSet"
	 */
	private List<DataSet> dataSets = new ArrayList<DataSet>();

	/**
	 * Getter of the property <tt>dataSets</tt>
	 * @return  Returns the dataSets.
	 * @uml.property  name="dataSets"
	 */
	public List<DataSet> getDataSets() {
		return dataSets;
	}

	/**
	 * Setter of the property <tt>dataSets</tt>
	 * @param dataSets  The dataSets to set.
	 * @uml.property  name="dataSets"
	 */
	public void setDataSets(List<DataSet> dataSets) {
		this.dataSets = dataSets;
	}

}
