package com.a_practice.utils;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.Hashtable;

public class DataUtil {

    public static ExcelReader excel = null;

    @DataProvider(name = "getUserData")
    public static Object[][] getData(Method m) {
        String getSheetName = m.getName() + "Data";

        if (excel == null) {
            excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\java\\source\\com\\a_practice\\excel\\testData.xlsx");
        }

        String sheetName = getSheetName;
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object[][] data = new Object[rows - 1][1];

        Hashtable<String, String> table = null;

        for (int rowNum = 2; rowNum <= rows; rowNum++) {

            table = new Hashtable<String, String>();

            for (int colNum = 0; colNum < cols; colNum++) {


                table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
                data[rowNum - 2][0] = table;

            }

        }


        return data;


    }

}


