package com.alipay.service.schema.util;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class XmlUtils {
    private static final String DEFAULT_ENCODE = "UTF-8";
    public static        String EGE            = "http://xml.org/sax/features/external-general-entities";
    public static        String EPE            = "http://xml.org/sax/features/external-parameter-entities";
    public static        String LED            = "http://apache.org/xml/features/nonvalidating/load-external-dtd";

    /**
     * Creates a new document instance.
     *
     * @return a new document instance
     */
    public static Document newDocument() {
        Document doc = null;
        doc = DocumentHelper.createDocument();
        doc.setXMLEncoding(DEFAULT_ENCODE);
        return doc;
    }

    /**
     * Parses the content of the given XML file as an XML document.
     *
     * @param file the XML file instance
     * @return the document instance representing the entire XML document
     * @throws SchemaException problem parsing the XML file
     */
    public static Document getDocument(File file) throws SchemaException {
        SAXReader reader = new SAXReader();
        reader.setEncoding(DEFAULT_ENCODE);

        Document doc = null;
        try {
            reader.setFeature(LED, false);
            reader.setFeature(EGE, false);
            reader.setFeature(EPE, false);
            doc = reader.read(file);
        } catch (DocumentException e) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, e);
        } catch (SAXException e) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, e);
        }
        return doc;
    }

    /**
     * Parses the content of the given XML file as an XML document.
     *
     * @param xml file inputstream
     * @return the document instance representing the entire XML document
     * @throws SchemaException problem parsing the XML file
     */
    public static Document getDocument(InputStream xml) throws SchemaException {
        SAXReader reader = new SAXReader();
        reader.setEncoding(DEFAULT_ENCODE);
        Document doc = null;
        try {
            reader.setFeature(LED, false);
            reader.setFeature(EGE, false);
            reader.setFeature(EPE, false);
            doc = reader.read(xml);
        } catch (DocumentException e) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, e);
        } catch (SAXException e) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, e);
        }
        return doc;
    }

    /**
     * Parses the content of the given XML file as an XML document.
     *
     * @param xml file InputSource
     * @return the document instance representing the entire XML document
     * @throws SchemaException problem parsing the XML file
     */
    public static Document getDocument(InputSource xml) throws SchemaException {
        SAXReader reader = new SAXReader();
        Document doc = null;

        try {
            reader.setFeature(LED, false);
            reader.setFeature(EGE, false);
            reader.setFeature(EPE, false);
            doc = reader.read(xml);
        } catch (DocumentException e) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, e);
        } catch (SAXException e) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, e);
        }
        return doc;
    }

    /**
     * Creates a root element as well as a new document with specific tag name.
     *
     * @param tagName the name of the root element
     * @return a new element instance
     * @throws SchemaException problem generating a new document
     */
    public static Element createRootElement(String tagName) throws SchemaException {
        Document doc = newDocument();
        Element root = DocumentHelper.createElement(tagName);
        doc.add(root);
        return root;
    }

    /**
     * Gets the root element from input stream.
     *
     * @param xml the XML file input stream
     * @return the root element of parsed document
     * @throws SchemaException problem parsing the XML file input stream
     */
    public static Element getRootElementFromStream(InputStream xml) throws SchemaException {
        return getDocument(xml).getRootElement();
    }

    /**
     * Gets the root element from given XML file.
     *
     * @param xml the name of the XML file
     * @return the root element of parsed document
     * @throws SchemaException problem parsing the XML file
     */
    public static Element getRootElementFromFile(File xml) throws SchemaException {
        return getDocument(xml).getRootElement();
    }

    /**
     * Gets the root element from the given XML payload.
     *
     * @param payload the XML payload representing the XML file.
     * @return the root element of parsed document
     * @throws SchemaException problem parsing the XML payload
     */
    public static Element getRootElementFromString(String payload) throws SchemaException {
        if (payload == null || payload.length() < 1) {
            throw new SchemaException(SchemaErrorEnum.XML_FORMAT_ERROR, "");
        }

        StringReader sr = new StringReader(escapeXml(payload));
        InputSource source = new InputSource(sr);
        return getDocument(source).getRootElement();
    }

    public static String escapeXml(String payload) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < payload.length(); i++) {
            char c = payload.charAt(i);
            if ((c == 0x9) || (c == 0xA) || (c == 0xD) || ((c >= 0x20) && (c <= 0xD7FF))
                    || ((c >= 0xE000) && (c <= 0xFFFD)) || ((c >= 0x10000) && (c <= 0x10FFFF))) {
                out.append(c);
            }
        }
        return out.toString();
    }

    /**
     * Converts the an XML file to XML payload.
     *
     * @param file the XML file instance
     * @return the XML payload representing the XML file
     * @throws SchemaException problem transforming XML to string
     */
    public static String xmlToString(File file) throws SchemaException {
        return getDocument(file).asXML();
    }

    /**
     * Gets the immediately child elements list from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tool name
     * @return the NOT NULL immediately child elements list
     */
    @SuppressWarnings("unchecked")
    public static List<Element> getChildElements(Element parent, String tagName) {
        List<Element> allNodes = parent.elements(tagName);
        List<Element> elements = new ArrayList<Element>();

        for (int i = 0; i < allNodes.size(); i++) {
            Element node = allNodes.get(i);
            if (node instanceof Element && node.getParent() == parent) {
                elements.add(node);
            }
        }
        return elements;
    }

    /**
     * Gets the descendant elements list from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tool name
     * @return the NOT NULL descendant elements list
     */
    public static List<Element> getElements(Element parent, String tagName) {
        @SuppressWarnings("unchecked")
        List<Element> allNodes = parent.elements();
        List<Element> elements = new ArrayList<Element>();

        for (int i = 0; i < allNodes.size(); i++) {
            Element node = allNodes.get(i);
            if (node instanceof Element) {
                elements.add(node);
            }
        }
        return elements;
    }

    /**
     * Gets the immediately descendant element from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tag name.
     * @return immediately descendant element of parent element, NULL otherwise.
     */
    public static Element getElement(Element parent, String tagName) {
        List<Element> children = getElements(parent, tagName);

        if (children.isEmpty()) {
            return null;
        } else {
            return children.get(0);
        }
    }

    /**
     * Gets the immediately child element from the parent element.
     *
     * @param parent  the parent element in the element tree
     * @param tagName the specified tag name
     * @return immediately child element of parent element, NULL otherwise
     */
    public static Element getChildElement(Element parent, String tagName) {
        List<Element> children = getChildElements(parent, tagName);

        if (children.isEmpty()) {
            return null;
        } else {
            return children.get(0);
        }
    }

    /**
     * Gets the value of the child element by tag name under the given parent
     * element. If there is more than one child element, return the value of the
     * first one.
     *
     * @param parent  the parent element
     * @param tagName the tag name of the child element
     * @return value of the first child element, NULL if tag not exists
     */
    public static String getElementValue(Element parent, String tagName) {
        Element element = getElement(parent, tagName);
        if (element != null) {
            return element.getText();
        } else {
            return null;
        }
    }

    /**
     * Gets the text value of current element.
     *
     * @param element parent the current element
     * @return text value of the element, NULL if element not exists
     */
    public static String getElementValue(Element element) {
        if (!StringUtil.isEmpty(element.getText())) {
            return element.getText();
        }
        return null;
    }

    /**
     * Gets the specific attribute's value form current element.
     *
     * @param current  current element
     * @param attrName attribute name in current element
     * @return attribute value if not null
     */
    public static String getAttributeValue(Element current, String attrName) {
        return current.attributeValue(attrName);
    }

    /**
     * Appends the child element to the parent element.
     *
     * @param parent  the parent element
     * @param tagName the child element name
     * @return the child element added to the parent element
     */
    public static Element appendElement(Element parent, String tagName) {
        return parent.addElement(tagName);
    }

    /**
     * Appends another element as a child element.
     *
     * @param parent the parent element
     * @param child  the child element to append
     */
    public static void appendElement(Element parent, Element child) {
        parent.add(child);
    }

    /**
     * Converts the Node/Element instance to XML payload.
     *
     * @param node the node/element instance to convert
     * @return the XML payload representing the node/element
     * @throws SchemaException problem converting XML to string
     */
    public static String nodeToString(Node node) throws SchemaException {
        return node.asXML();
    }

    /**
     * Converts the an XML file input stream to XML payload.
     *
     * @param in the XML file input stream
     * @return the payload represents the XML file
     * @throws SchemaException problem transforming XML to string
     */
    public static String xmlToString(InputStream in) throws SchemaException {
        Element root = getRootElementFromStream(in);
        return nodeToString(root);
    }

}
