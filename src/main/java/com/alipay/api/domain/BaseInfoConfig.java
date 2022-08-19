package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务基础信息
 *
 * @author auto create
 * @since 1.0, 2019-11-15 09:41:56
 */
public class BaseInfoConfig extends AlipayObject {

	private static final long serialVersionUID = 8372671795431138654L;

	/**
	 * 商户联系人邮箱，需为合法的邮箱。
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 商户联系人电话，需为合法的电话号码。
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 信用服务logo地址，为必传字段，需为合法的链接。
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 信用服务名称，为必传字段。
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
