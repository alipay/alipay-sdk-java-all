package com.alipay.v3.util.schema.api;

import com.alipay.v3.util.schema.exception.SchemaException;
import com.alipay.v3.util.schema.model.attribute.Attribute;
import com.alipay.v3.util.schema.util.XmlUtils;
import org.dom4j.Element;

import java.util.List;

public class ServiceSchemaWriter {

    public static String writeSchemaXmlString(List<Attribute> attributes) throws SchemaException {
        Element root = XmlUtils.createRootElement("serviceSchema");
        for (Attribute attribute : attributes) {
            Element attributeNode = attribute.toValueElement();
            XmlUtils.appendElement(root, attributeNode);
        }
        return XmlUtils.nodeToString(root);
    }

    public static String writeFullchemaXmlString(List<Attribute> attributes) throws SchemaException {
        Element root = XmlUtils.createRootElement("serviceSchema");
        for (Attribute attribute : attributes) {
            Element attributeNode = attribute.toElement();
            XmlUtils.appendElement(root, attributeNode);
        }
        return XmlUtils.nodeToString(root);
    }

}
