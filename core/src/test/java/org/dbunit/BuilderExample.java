package org.dbunit;

import static org.dbunit.DataSetBuilder.col;

import static java.sql.Types.*;

public class BuilderExample {
	public void testBuilder() throws Exception {
		DataSet dataSet = new DataSetBuilder().table("first")
				.cols("id", "username", "password", "display")
				.row(1, "rlogiacco", "rlogiacco", "Roberto Lo Giacco")
				.row(2, "asd", "asd").row(3, "asd", "asd", "asd")
				.table("second")
				.cols("id", "first", "display", "name", "surname", "email")
				.row(1, null, "some", "name", "surname")
				.row(2, 1, "some", "name", "surname");

		DataSet dataSet2 = new DataSetBuilder()
				.table("first")
				.cols(col("id", BIGINT), col("username", VARCHAR),
						col("password", VARBINARY), col("display", VARCHAR))
				.row(1, "rlogiacco", "rlogiacco", "Roberto Lo Giacco")
				.row(2, "asd", "asd")
				.row(3, "asd", "asd", "asd")
				.table("second")
				.cols(col("id", BIGINT), col("first", VARCHAR),
						col("display", VARCHAR), col("name", VARCHAR),
						col("surname", VARCHAR), col("email", VARCHAR))
				.row(1, null, "some", "name", "surname")
				.row(2, 1, "some", "name", "surname");
	}
}
