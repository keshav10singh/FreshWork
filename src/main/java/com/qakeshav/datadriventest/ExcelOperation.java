package com.qakeshav.datadriventest;

import com.qakeshav.utility.Xls_Reader1;

public class ExcelOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader1 reader = new Xls_Reader1(
				"D:\\Automation-Project\\GitFreshWork\\src\\main\\java\\com\\qakeshav\\testdata\\freecrmtest.xlsx");
		reader.addSheet("HomePage");

		if (reader.isSheetExist("HomePage")) {
			System.out.println("Sheet already Exist");
		} else {
			reader.addSheet("HomePage");
			System.out.println("new Sheet is added");
		}

		int colCount = reader.getColumnCount("c");
		System.out.println("Total Column" + colCount);
		
		System.out.println("Row Number is---");
		System.out.println(reader.getCellRowNum("RegsTestData", "firstname", "keshav"));
	}

}
