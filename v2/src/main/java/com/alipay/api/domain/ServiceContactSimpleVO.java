package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务联系人
 *
 * @author auto create
 * @since 1.0, 2019-12-04 19:59:24
 */
public class ServiceContactSimpleVO extends AlipayObject {

	private static final long serialVersionUID = 7219373289555913122L;

	/**
	 * 服务联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 服务联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 服务联系人电话
	 */
	@ApiField("contact_tele")
	private String contactTele;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTele() {
		return this.contactTele;
	}
	public void setContactTele(String contactTele) {
		this.contactTele = contactTele;
	}

}
