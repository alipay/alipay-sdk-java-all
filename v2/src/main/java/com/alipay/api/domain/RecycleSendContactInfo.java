package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收工程师信息
 *
 * @author auto create
 * @since 1.0, 2026-01-07 17:37:42
 */
public class RecycleSendContactInfo extends AlipayObject {

	private static final long serialVersionUID = 2493468443411553722L;

	/**
	 * 工程师联系方式
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 工程师名称
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
