package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权查询
 *
 * @author auto create
 * @since 1.0, 2024-11-14 14:53:21
 */
public class AlipayEbppInvoiceUserAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4752351287272147341L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 用于查询授权的发票的预览链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

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

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
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
