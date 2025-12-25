package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫合作方鉴权
 *
 * @author auto create
 * @since 1.0, 2025-11-17 14:17:42
 */
public class AlipayCommerceHdfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2238422289573412279L;

	/**
	 * 好大夫的authCode
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 双方定义
	 */
	@ApiField("biz_source")
	private String bizSource;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

}
