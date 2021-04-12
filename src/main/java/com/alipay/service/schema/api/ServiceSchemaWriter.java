/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.api;

import java.util.List;

import org.dom4j.Element;

import com.alipay.service.schema.exception.ServiceSchemaException;
import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.util.XmlUtils;

/**
 * @author junying
 * @version : ServiceSchemaWriter.java, v 0.1 2021年03月17日 10:14 下午 junying Exp $
 */
public class ServiceSchemaWriter {

    public static String writeSchemaXmlString(List<Attribute> attributes) throws ServiceSchemaException {
        Element root = XmlUtils.createRootElement("serviceSchema");
        for (Attribute attribute : attributes) {
            Element attributeNode = attribute.toElement();
            XmlUtils.appendElement(root, attributeNode);
        }
        return XmlUtils.nodeToString(root);
    }

}