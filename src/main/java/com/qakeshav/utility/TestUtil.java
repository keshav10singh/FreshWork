//package com.qakeshav.utility;
//
//import java.util.ArrayList;
//
//import org.apache.poi.xssf.eventusermodel.XSSFBReader;
//
//public class TestUtil {
//	static Xls_Reader1 reader;
//	public static ArrayList<Object[]> getDataFromExcel() {
//		ArrayList<Object[]> myData =new ArrayList<Object[]>();
//		try {
//			reader=new Xls_Reader1("D://Automation-Project//GitFreshWork//src//main//java//com//qakeshav//testdata\freecrmtest.xlsx");
//			
//		}Catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		for(int rowNum=2;rowNum<=reader.getRowCount("Users");rowNum++) {
//			
//				String crk= reader.getCellData("PRSCrossRef","crk",rowCnt);
//				String crkv= reader.getCellData("PRSCrossRef","crkv",rowCnt);
//				String crv= reader.getCellData("PRSCrossRef","crv",rowCnt);
//				String crvv= reader.getCellData("PRSCrossRef","crvv",rowCnt);
//				String orgid= reader.getCellData("PRSCrossRef","orgid",rowCnt);
//				String ppk= reader.getCellData("PRSCrossRef","ppk",rowCnt);
//				myData.add(new object[] {crk,crkv,crv,crvv,orgid,ppk});
//			
//		}
//		return myData;
//		
//	}
//	
//	
//}
