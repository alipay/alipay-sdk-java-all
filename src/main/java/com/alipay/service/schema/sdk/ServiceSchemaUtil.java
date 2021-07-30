/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.sdk;

import com.alipay.service.schema.api.ServiceSchemaWriter;
import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.attribute.Attribute;
import com.alipay.service.schema.model.attribute.SingleAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author junying
 * @version : ServiceSchemaUtil.java, v 0.1 2021年03月24日 5:04 下午 junying Exp $
 */
public class ServiceSchemaUtil {
    public static String schemaXmlString(ServiceSchema serviceSchema, Map<String, Attribute> xmlMap) throws SchemaException {

        SingleAttribute serviceName = (SingleAttribute) xmlMap.get("serviceName");
        serviceName.setValue(serviceSchema.getServiceName());
        xmlMap.put("serviceName", serviceName);
        SingleAttribute serviceDesc = (SingleAttribute) xmlMap.get("serviceDesc");
        serviceDesc.setValue(serviceSchema.getServiceDesc());
        xmlMap.put("serviceDesc", serviceDesc);

        //        MultiComplexAttribute serviceUrl = (serviceUrl)xmlMap.get("serviceUrl");
        //        List<ComplexAttribute> serviceUrlAttributes = new ArrayList<ComplexAttribute>();

        List<Attribute> attributeList = new ArrayList<Attribute>();
        attributeList.add(xmlMap.get("serviceName"));
        attributeList.add(xmlMap.get("serviceDesc"));
        attributeList.add(xmlMap.get("serviceUrl"));
        return ServiceSchemaWriter.writeSchemaXmlString(attributeList);
    }
}