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

import java.util.Collection;
import java.util.Map;

/**
 * @author   rlogiacco
 * @uml.dependency   supplier="org.dbunit.DataSet"
 * @uml.dependency   supplier="org.dbunit.Format"
 */
public class DataSetFactory {

	public static DataSet load(String url) {
		return null;
	}

	public static DataSet load(String url, Format format) {
		return null;
	}

	public static void save(String url, Format format, DataSet dataSet) {

	}

	/**
	 * @uml.property  name="handlers"
	 * @uml.associationEnd  inverse="dataSetFactory1:org.dbunit.DataSetFormatHandler" qualifier="format:org.dbunit.Format org.dbunit.DataSetFormatHandler"
	 */
	private Map<Format, DataSetFormatHandler> handlers;

	/**
	 * Getter of the property <tt>handlers</tt>
	 * @return  Returns the format handlers map.
	 * @uml.property  name="handlers"
	 */
	public Map<Format, DataSetFormatHandler> getHandlers() {
		return handlers;
	}

	/**
	 * Setter of the property <tt>handlers</tt>
	 * @param handlers  The format handlers map to set.
	 * @uml.property  name="handlers"
	 */
	public void setHandlers(Map<Format, DataSetFormatHandler> handlers) {
		this.handlers = handlers;
	}

}
