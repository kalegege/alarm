package com.wasu.utils;

import com.wasu.model.Policy;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kale on 2017/9/20.
 */
public class OtherUtils {

    public static void main(String[] args) {
        readXml("/Users/kale/test/qiusuo1.xls");
        System.out.println("-------------------");
    }

    public static List<Policy> readXml(String fileName) {
        boolean isE2007 = false;    //判断是否是excel2007格式
        List<Policy> list = new ArrayList<Policy>();

        if (fileName.endsWith("xlsx"))
            isE2007 = true;
        try {
            InputStream input = new FileInputStream(fileName);  //建立输入流
            Workbook wb = null;
            //根据文件格式(2003或者2007)来初始化
            if (isE2007)
                wb = new XSSFWorkbook(input);
            else
                wb = new HSSFWorkbook(input);
            Sheet sheet = wb.getSheetAt(0);     //获得第一个表单
            int coloumNum = sheet.getRow(0).getPhysicalNumberOfCells();//获得总列数
            int rowNum = sheet.getLastRowNum();//获得总行数
            for (int i = 1; i < rowNum; i++) {
                Row row = sheet.getRow(i);
                String fileName1 = row.getCell(0) != null ? row.getCell(0).getStringCellValue() : "";
                if (i == 40) {
                    System.out.println("ddd");
                }
                if (!fileName1.equals("")) {
                    list.add(new Policy(row.getCell(10).getStringCellValue(), row.getCell(11).getStringCellValue()));
                }
            }
            System.out.println("dddd");
            return list;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
