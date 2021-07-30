package com.alipay.service.schema.model.option;

import com.alipay.service.schema.exception.SchemaException;
import com.alipay.service.schema.model.enums.SchemaErrorEnum;
import com.alipay.service.schema.util.StringUtil;
import com.alipay.service.schema.util.XmlUtils;
import org.dom4j.Element;

/**
 * @author hongbi.wang
 * @version $Id: Option.java, v 0.1 2021年03月01日 11:13 AM hongbi.wang Exp $
 */
public class Option {
    protected String displayName;
    protected String value;

    public Element toElement(String attributeId) throws SchemaException {
        Element option = XmlUtils.createRootElement("option");
        if (StringUtil.isEmpty(this.displayName)) {
            throw new SchemaException(SchemaErrorEnum.OPTION_NAME_ERROR, attributeId);
        }
        if (StringUtil.isEmpty(this.value)) {
            throw new SchemaException(SchemaErrorEnum.OPTION_VALUE_ERROR, attributeId);
        }
        option.addAttribute("displayName", this.displayName);
        option.addAttribute("value", this.value);

        return option;
    }

    /**
     * Getter method for property <tt>displayName</tt>.
     *
     * @return property value of displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter method for property <tt>displayName</tt>.
     *
     * @param displayName value to be assigned to property displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter method for property <tt>value</tt>.
     *
     * @return property value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter method for property <tt>value</tt>.
     *
     * @param value value to be assigned to property value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
