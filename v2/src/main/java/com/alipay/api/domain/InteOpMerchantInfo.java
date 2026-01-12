package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业商户信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 6796823554594574587L;

	/**
	 * 商户联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 商户联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}
