package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-21 10:01:32
 */
public class ZhimaCustomerZmcardInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5794373196396951846L;

	/** 
	 * 被查看人的信用等级
	 */
	@ApiField("credit_level")
	private String creditLevel;

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
