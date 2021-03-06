/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author estadm
 */
public class Xml {
    String _tipo;
    int _numEntrada;
    String ruta;
    
    public Xml(String ptipo, int pnumEntrada){
        _tipo = ptipo;
        _numEntrada = pnumEntrada;
        
    }
    public String direccion(){
        if (_tipo.equals("And")){
            if(_numEntrada == 2)
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_And_3_1.xml";
            else
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_And_3_1.xml";     
        }
        if (_tipo.equals("Or")){
            if(_numEntrada == 2)
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Or_2_1.xml";
            else
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Or_3_1.xml";    
        }
        if (_tipo.equals("Nand")){
            if(_numEntrada == 2)
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Nand_2_1.xml";
            else
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Nand_3_1.xml";    
        }
        if (_tipo.equals("Nor")){
            if(_numEntrada == 2)
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Nor_2_1.xml";
            else
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Nor_3_1.xml";    
        }
        if (_tipo.equals("Xnor")){
            if(_numEntrada == 2)
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Xnor_2_1.xml";
            else
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Xnor_3_1.xml";    
        }
        if (_tipo.equals("Xor")){
            if(_numEntrada == 2)
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Xor_2_1.xml";
            else
                ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Xor_3_1.xml";    
        }
        if (_tipo.equals("Not")){
            ruta = "/D:/Usuarios/estadm/Documents/NetBeansProjects/FinalLogicTec/src/xml/Xml_Npt_1_1.xml";
        }
        
        return ruta;
    }
    
    public String getimageName(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(direccion());

            // Create XPathFactory object
            XPathFactory xpathFactory = XPathFactory.newInstance();

            // Create XPath object
            XPath xpath = xpathFactory.newXPath();

            String name = getImageName(doc, xpath);
            return name;
          

            /*List<String> names = getEmployeeNameWithAge(doc, xpath, 30);
            System.out.println("Employees with 'age>30' are:" + Arrays.toString(names.toArray()));

            List<String> femaleEmps = getFemaleEmployeesName(doc, xpath);
            System.out.println("Female Employees names are:" +
                    Arrays.toString(femaleEmps.toArray()));*/

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            return "";
        }
        

    }


    private static List<String> getImageNames(Document doc, XPath xpath,String entrada) {
        List<String> list = new ArrayList<>();
        try {
            //create XPathExpression object
            XPathExpression expr =
                    xpath.compile(entrada);
                //xpath.compile("//Employee[gender='Female']/name/text()");
            
            //evaluate expression result on XML document
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }


    private static List<String> getEmployeeNameWithAge(Document doc, XPath xpath, int age) {
        List<String> list = new ArrayList<>();
        try {
            XPathExpression expr =
                xpath.compile("/Employees/Employee[age>" + age + "]/name/text()");
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }


    public String getImageName(Document doc, XPath xpath) {
        String name = null;
        try {
            XPathExpression expr =
                xpath.compile("/Comp/Img/text()");
            name = (String) expr.evaluate(doc, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return name;
    }

}

