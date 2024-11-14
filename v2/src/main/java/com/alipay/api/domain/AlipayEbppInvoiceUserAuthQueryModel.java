package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权查询
 *
 * @author auto create
 * @since 1.0, 2024-11-11 13:37:17
 */
public class AlipayEbppInvoiceUserAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6328892518717821566L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 授权查询来源唯一标识
	 */
	@ApiField("source_tag")
	private String sourceTag;

	/**
	 * 用户开票邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getSourceTag() {
		return this.sourceTag;
	}
	public void setSourceTag(String sourceTag) {
		this.sourceTag = sourceTag;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
