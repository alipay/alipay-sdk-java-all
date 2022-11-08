package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 16:23:54
 */
public class ZhimaCustomerZmcardInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7355248768576913118L;

	/** 
	 * 被查看人的信用等级，范围[信用极好，信用优秀，信用良好，信用中等，信用较差]。用户已授权且接入方是二方商户才返回。
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/** 
	 * 用户的芝麻分分级编码。分值范围[A,B,C,D,E]，和credit_level对应。用户已授权且接入方是二方商户才返回。
	 */
	@ApiField("level_code")
	private String levelCode;

	/** 
	 * 芝麻证页面拉端查看链接，主态：开通且已授权才会返回此url，客态：只要已开通就会返回此url。
	 */
	@ApiField("skip_url")
	private String skipUrl;

	/** 
	 * 1.未开通芝麻返回ZM_ACCOUNT_NOT_EXISTED；2.未授权时会返回ZM_CARD_NO_AUTH；3.否则返回null。
	 */
	@ApiField("sub_code")
	private String subCode;

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getCreditLevel( ) {
		return this.creditLevel;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getLevelCode( ) {
		return this.levelCode;
	}

	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}
	public String getSkipUrl( ) {
		return this.skipUrl;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

}
