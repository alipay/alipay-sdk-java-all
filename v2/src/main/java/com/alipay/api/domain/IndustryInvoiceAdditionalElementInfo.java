package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附加要素列表
 *
 * @author auto create
 * @since 1.0, 2026-10-15 22:54:11
 */
public class IndustryInvoiceAdditionalElementInfo extends AlipayObject {

	private static final long serialVersionUID = 5324461354965928325L;

	/**
	 * 附加要素名称
	 */
	@ApiField("element_name")
	private String elementName;

	/**
	 * 附加要素类型
	 */
	@ApiField("element_type")
	private String elementType;

	/**
	 * 附加要素值
	 */
	@ApiField("element_value")
	private String elementValue;

	public String getElementName() {
		return this.elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementType() {
		return this.elementType;
	}
	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getElementValue() {
		return this.elementValue;
	}
	public void setElementValue(String elementValue) {
		this.elementValue = elementValue;
	}

}
