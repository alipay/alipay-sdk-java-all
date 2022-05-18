package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-08 14:01:41
 */
public class ZhimaCustomerZmcardInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8619978342532146596L;

	/** 
	 * 被查看人的信用等级，范围[信用极好，信用优秀，信用良好，信用中等，信用较差]
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/** 
	 * 用户的芝麻分分级编码。分值范围[A,B,C,D,E]
	 */
	@ApiField("level_code")
	private String levelCode;

	/** 
	 * 芝麻证h5跳转链接，若被查看人已经授权，则会返回此url，点击后进入芝麻证h5页面
	 */
	@ApiField("skip_url")
	private String skipUrl;

	/** 
	 * 需要升级授权，此情况也调用服务开通api
zhima.credit.payafteruse.creditagreement.sign
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
