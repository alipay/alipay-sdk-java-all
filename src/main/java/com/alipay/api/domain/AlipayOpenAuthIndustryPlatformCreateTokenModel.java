package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业平台获取授权码
 *
 * @author auto create
 * @since 1.0, 2019-07-24 10:18:32
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenModel extends AlipayObject {

	private static final long serialVersionUID = 4176139819384419653L;

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
