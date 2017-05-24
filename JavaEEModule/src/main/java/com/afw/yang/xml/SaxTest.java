package com.afw.yang.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by afw on 2017/5/24.
 *
 */
public class SaxTest {

    public static void main(String[] args) {

        SAXReader saxReader = new SAXReader();
//        File file = new File("./JavaEEModule/src/main/resources/text");

        try {
            File file = new File("./JavaEEModule/web/WEB-INF/web.xml");
            Document document = saxReader.read(file);
            Element rootElement = document.getRootElement();
            System.out.println(rootElement.attributeValue("version"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
