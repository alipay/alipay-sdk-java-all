package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店联系方式
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseShopContactWayInfo extends AlipayObject {

	private static final long serialVersionUID = 1539321563855735172L;

	/**
	 * 联系类型
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 联系值
	 */
	@ApiField("contact_value")
	private String contactValue;

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactValue() {
		return this.contactValue;
	}
	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}

}
