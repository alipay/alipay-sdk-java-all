package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.data.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditAutofinanceDataGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2296689951163339896L;

	/** 
	 * 根据查询条件将数据组装成各平台需要的格式
	 */
	@ApiField("autofinancedata")
	private String autofinancedata;

	public void setAutofinancedata(String autofinancedata) {
		this.autofinancedata = autofinancedata;
	}
	public String getAutofinancedata( ) {
		return this.autofinancedata;
	}

}
