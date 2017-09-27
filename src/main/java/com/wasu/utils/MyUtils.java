package com.wasu.utils;

import com.wasu.model.Item;
import com.wasu.model.Menu;
import com.wasu.model.Policy;
import com.wasu.model.Role;
import com.wasu.service.DiTuiyjService;
import com.wasu.service.QunZhuyjService;
import com.wasu.service.RoleService;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kale on 2017/8/28.
 */
public class MyUtils {
    private static Logger logger = Logger.getLogger(MyUtils.class.getName());
    public static String JSP_TYPE = "type";
    public static String JSP_MENU = "menu";
    public static String JSP_QUNZHU = "qunzhu";
    public static String JSP_DITUI = "ditui";
    public static String JSP_DATE = "date";

    public static String ROLE_ADMIN = "ROLE_ADMIN";
    public static String ROLE_USER = "ROLE_USER";
    public static String ROLE_PUSH = "ROLE_PUSH";
    public static String ROLE_RESTRICTED_ADMIN = "ROLE_RESTRICTED_ADMIN";
    public static String ROLE_SERV = "ROLE_SERV";

    public static String SESSION_USER = "adminsession";

    @Autowired
    private QunZhuyjService qunZhuyjService;

    @Autowired
    private DiTuiyjService diTuiyjService;

    @Autowired
    private RoleService roleService;


    /***
     *  利用Apache的工具类实现SHA-256加密
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256Str(String str) {
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }

    /**
     * json对象转换成java对象，并获取java对象属性t
     */
    public static Menu fromJsonToJava() {
        String laststr = "";
        Menu stu = null;
        String path = "/Users/kale/test/menu1.json";
        String path1 = "/json/menu1.json";
        // 读取原始json文件并进行操作和输出
        try {
            BufferedReader br = new BufferedReader(new FileReader(path1));// 读取原始json文件
            String tempString = null;
            while ((tempString = br.readLine()) != null) {
                laststr = laststr + tempString;
            }
            br.close();

            JSONObject json = JSONObject.fromObject(laststr);
            JSONArray jarry = json.getJSONArray("children");
            List<Item> blist = (List<Item>) JSONArray.toCollection(jarry, Item.class);
            stu = (Menu) JSONObject.toBean(json, Menu.class);
            stu.setChildren(blist);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return stu;
    }

    /**
     * 显示时间和地推 2--群主 3--地推 4--管理员
     * <p>
     * id   key
     * 1    ROLE_ADMIN                  2
     * 2    ROLE_RESTRICTED_ADMIN       2
     * 3    ROLE_USER                   0
     * 4    ROLE_PUSH                   1
     * 12   ROLE_SERV                   2
     * 13   ROLE_JIESAN                 2
     */
    public static int addModelByRole(Model model, Role role) {
        int menu = 0;
//        int ditui=0;
//        int qunzhu=0;
        int date = 0;
//        List<DiTuiyj> diTuiyjs = null;
//        List<QunZhu> qunZhus = null;

        if (role == null) {
            //只显示时间
            menu = 1;
            date = 1;
        } else if (role.getRoleKey().equals(ROLE_USER)) {
            //群主
            menu = 2;
        } else if (role.getRoleKey().equals(ROLE_PUSH)) {
            //地推
            menu = 3;
//            qunzhu=1;
        } else {
            //管理员
            menu = 4;
//            ditui=1;
//            qunzhu=1;
        }

        if (menu != 0) {
            model.addAttribute(JSP_MENU, menu);
        }
        if (date != 0) {
            model.addAttribute(JSP_DATE, date);
        }
        return menu;
    }

    /**
     * @param model
     * @param text
     */
    public static void addJspType(Model model, String text) {
        if (text != null) {
            model.addAttribute(JSP_TYPE, text);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
//        Menu menu = fromJsonToJava();
//        System.out.println("test");

        String path = "/Users/kale/test/qiusuo1.xls";
//        File file = new File(path);
//        readExcelAddXML(file, "/Users/kale/test");

//        writeXml(file);
        writeXml1(path);

    }

    public static String format(String str) throws Exception {
        SAXReader reader = new SAXReader();
        // System.out.println(reader);
        // 注释：创建一个串的字符输入流
        StringReader in = new StringReader(str);
        Document doc = reader.read(in);
        // System.out.println(doc.getRootElement());
        // 注释：创建输出格式
        OutputFormat formater = OutputFormat.createPrettyPrint();
        //formater=OutputFormat.createCompactFormat();
        // 注释：设置xml的输出编码
        formater.setEncoding("utf-8");
        // 注释：创建输出(目标)
        StringWriter out = new StringWriter();
        // 注释：创建输出流
        XMLWriter writer = new XMLWriter(out, formater);
        // 注释：输出格式化的串到目标中，执行后。格式化后的串保存在out中。
        writer.write(doc);

        writer.close();
        System.out.println(out.toString());
        // 注释：返回我们格式化后的结果
        return out.toString();
    }

    /**
     * 封装读取excel到xml的方法
     *
     * @param f
     * @param path
     */
    public static void readExcelAddXML(File f, String path) {
        OutputStreamWriter pw = null;
//        XMLWriter pw=null;
        try {
            List<Policy> list = readExcelFileOutList(f);
            //String tempFile = "E:\\import\\test.xml";
            File file = new File(path, "tianlong.xml");
            if (!file.exists()) {
                file.createNewFile();
            }

//            StringWriter out = new StringWriter();
//            pw=new XMLWriter(out,"utf-8");

            //确认流的输出文件和编码格式，此过程创建了“test.txt”实例
            pw = new OutputStreamWriter(new FileOutputStream(file), "utf-8");

            pw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n");
            pw.write("<ADI xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" + "\n");
            pw.write("<Mappings>" + "\n");
            for (int i = 0; i < list.size(); i++) {
                pw.write("<Mapping" + "\n");
                pw.write("<Property Name=\"ValidStart\">" + list.get(i).getStartTime() + "</Property>" + "\n");
                pw.write("<Property Name=\"ValidEnd\">" + list.get(i).getStopTime() + "</Property>" + "\n");
                pw.write("</Mapping>");
                pw.flush();
            }
            pw.write("\n" + "</Mappings>");
            pw.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();//关闭流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void writeXml(File f) {
        List<Policy> list = readExcelFileOutList(f);

        Document document = DocumentHelper.createDocument();
        Element adi=document.addElement("ADI")
                .addAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
        Element Objects=adi.addElement("Objects");
        Element object=Objects.addElement("Object")
                .addAttribute("ElementType","Program")
                .addAttribute("Action", "REGIST");
        Element type=object.addElement("Property")
                .addAttribute("Name","Type");
        type.setText("4");

//        document.setText("<ADI xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n");
        Element mappings = adi.addElement("Mappings");
        for (int i = 0; i < list.size(); i++) {
            Element employee = mappings.addElement("Mapping")
                    .addAttribute("ElementType", "Program")
                    .addAttribute("Action", "REGIST");
            Element startTime = employee.addElement("Property")
                    .addAttribute("Name", "ValidStart");
            startTime.setText(list.get(i).getStartTime());
            Element stopTime = employee.addElement("Property")
                    .addAttribute("Name", "ValidEnd");
            stopTime.setText(list.get(i).getStopTime());
        }

        try {
            OutputFormat format = new OutputFormat();
            format.setIndent(true);
            format.setNewlines(true);
            Writer fileWriter = new FileWriter("/Users/kale/test/test.xml");
            XMLWriter xmlWriter = new XMLWriter(fileWriter, format);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 从excel获取list，并输出xml
     * @param path
     */
    public static void writeXml1(String path) {
        List<Policy> list = OtherUtils.readXml(path);

        Document document = DocumentHelper.createDocument();
        Element adi=document.addElement("ADI")
                .addAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
        Element Objects=adi.addElement("Objects");
        Element object=Objects.addElement("Object")
                .addAttribute("ElementType","Program")
                .addAttribute("Action", "REGIST");
        Element type=object.addElement("Property")
                .addAttribute("Name","Type");
        type.setText("4");

//        document.setText("<ADI xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n");
        Element mappings = adi.addElement("Mappings");
        for (int i = 0; i < list.size(); i++) {
            Element employee = mappings.addElement("Mapping")
                    .addAttribute("ElementType", "Program")
                    .addAttribute("Action", "REGIST");
            Element startTime = employee.addElement("Property")
                    .addAttribute("Name", "ValidStart");
            startTime.setText(list.get(i).getStartTime());
            Element stopTime = employee.addElement("Property")
                    .addAttribute("Name", "ValidEnd");
            stopTime.setText(list.get(i).getStopTime());
        }

        try {
            OutputFormat format = new OutputFormat();
            format.setIndent(true);
            format.setNewlines(true);
            Writer fileWriter = new FileWriter("/Users/kale/test/test1.xml");
            XMLWriter xmlWriter = new XMLWriter(fileWriter, format);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * 读取excel到list
     *
     * @param f
     * @return
     */
    private static List<Policy> readExcelFileOutList(File f) {
        System.out.println("进入到readExcelFileOutList()");
        List<Policy> list = new ArrayList<Policy>();
        InputStream is = null;
        Workbook rwb = null;
        try {
            is = new FileInputStream(f);
            rwb = Workbook.getWorkbook(is);
            //获得总的Sheets，得到sheet的层数
            Sheet[] sheets = rwb.getSheets();
            int sheetLen = sheets.length;
            jxl.Sheet rs = rwb.getSheet(0);
            int num_row = rs.getRows();//得到行数
            int num_column = rs.getColumns();//得到列数
            System.out.println("行:" + num_row + "列:" + num_column);

            for (int j = 1; j < num_row; j++) {
                Cell[] cell = rs.getRow(j);//得到第j行的所有值

                for (int column_index = 0; column_index < cell.length; column_index++) {
                    System.out.println("当前行数是：" + j);
                    if (j == 41) {
                        System.out.println("41");
                    }
                    String fileName = cell[column_index++].getContents();
                    String fileType = cell[column_index++].getContents();
                    String contentIndex = cell[column_index++].getContents();
                    String area = cell[column_index++].getContents();
                    String year = cell[column_index++].getContents();
                    String actor = cell[column_index++].getContents();
                    String director = cell[column_index++].getContents();
                    String interest = cell[column_index++].getContents();
                    String content = cell[column_index++].getContents();
                    String contentCompany = cell[column_index++].getContents();
                    String startTime = cell[column_index++].getContents();
//                    String stopTime = cell[column_index] != null ? cell[column_index].getContents() : "";
//                    String series = cell[column_index + 1] != null ? cell[column_index + 1].getContents() : "";
                    String stopTime="";
                    String series="";
                    if (!fileName.equals("")) {
                        list.add(new Policy(fileName, fileType, contentIndex, area, year, actor, director, interest, content, contentCompany, startTime, stopTime, series));
                    }
                    break;
                }
            }
            rwb.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
                if (rwb != null) rwb.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
