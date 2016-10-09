package formats.db.fileformats.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class RunnerXml {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse("Customer.xml");

        //Show name item with id_cs=3
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("customer/list/item[@id_cs=3]/f_name");
        String result = (String) expr.evaluate(document, XPathConstants.STRING);
        System.out.println(result);
        System.out.println("============================");

        //Count elements with tag <item>
        XPathExpression exprCountItem = xpath.compile("count(//item)");
        String resultCount = (String) exprCountItem.evaluate(document, XPathConstants.STRING);
        System.out.println(resultCount);
        System.out.println("============================");

        //Select the sum of the 'id_cs' attributes of the element
        XPathExpression exprSumId = xpath.compile("sum(//item/@id_cs)");
        String resultSumId = (String) exprSumId.evaluate(document, XPathConstants.STRING);
        System.out.println(resultSumId);

        document.getDocumentElement().normalize();

        System.out.println("============================");
        System.out.println("root element: "
                + document.getDocumentElement().getNodeName());
        System.out.println("============================");

        // All elem "item"
        NodeList nodeList = document.getElementsByTagName("item");

        for (int i = 0; i < nodeList.getLength(); i++) {
            // Show information about each item
            Node node = nodeList.item(i);
            //System.out.println();
            System.out.println("Current element: " + node.getNodeName());
            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                System.out.println("ID_CS: "
                        + element.getAttribute("id_cs"));
                System.out.println("F_NAME: " + element
                        .getElementsByTagName("f_name").item(0)
                        .getTextContent());
                System.out.println("L_NAME: " + element
                        .getElementsByTagName("l_name").item(0)
                        .getTextContent());


            }
        }
    }
}
