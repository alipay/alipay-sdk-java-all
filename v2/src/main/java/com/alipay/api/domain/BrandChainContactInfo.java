package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家联系方式
 *
 * @author auto create
 * @since 1.0, 2026-01-06 09:42:42
 */
public class BrandChainContactInfo extends AlipayObject {

	private static final long serialVersionUID = 3591886998697664398L;

	/**
	 * 联系人手机号码
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人名称
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
