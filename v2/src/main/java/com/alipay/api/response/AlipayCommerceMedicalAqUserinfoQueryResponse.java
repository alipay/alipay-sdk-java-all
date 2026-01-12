package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.aq.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 10:57:41
 */
public class AlipayCommerceMedicalAqUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3466254117454991822L;

	/** 
	 * 表示当前请求是否有可查询的账户
	 */
	@ApiField("has_quick_account")
	private Boolean hasQuickAccount;

	/** 
	 * 代表当前请求的随机值
	 */
	@ApiField("random_key")
	private String randomKey;

	public void setHasQuickAccount(Boolean hasQuickAccount) {
		this.hasQuickAccount = hasQuickAccount;
	}
	public Boolean getHasQuickAccount( ) {
		return this.hasQuickAccount;
	}

	public void setRandomKey(String randomKey) {
		this.randomKey = randomKey;
	}
	public String getRandomKey( ) {
		return this.randomKey;
	}

}
