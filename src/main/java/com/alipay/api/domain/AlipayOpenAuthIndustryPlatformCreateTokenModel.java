package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台获取授权码
 *
 * @author auto create
 * @since 1.0, 2020-07-30 15:16:04
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenModel extends AlipayObject {

	private static final long serialVersionUID = 5689841284967434241L;

	/**
	 * isv的appid
	 */
	@ApiField("isv_appid")
	private String isvAppid;

	/**
	 * auth_mycar_violation
	 */
	@ApiField("scope")
	private String scope;

	public String getIsvAppid() {
		return this.isvAppid;
	}
	public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

}
