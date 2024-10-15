package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过华为云MP注册账号
 *
 * @author auto create
 * @since 1.0, 2024-04-17 14:36:50
 */
public class AnttechOceanbasePassportHuaweimpCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7893157419332119524L;

	/**
	 * 非必传，取值为加密后的登录凭证
	 */
	@ApiField("credential")
	private String credential;

	/**
	 * 客户在华为云注册账号的唯一标识。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户在华为云注册的账户名
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 客户邮箱。非必传，如需此参数，在商品发布时“需要用户授权”请选择“基于邮箱创建应用管理账号等信息”
	 */
	@ApiField("email")
	private String email;

	/**
	 * 客户手机号。非必传，如需此参数，在商品发布时“需要用户授权”请选择“基于手机号码创建应用管理账号等信息”
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	public String getCredential() {
		return this.credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

}
