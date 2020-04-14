package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.puc.charge response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayWeiboPucChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8269743657638695935L;

	/** 
	 * 返回页面内容
	 */
	@ApiField("partnerpuccharge")
	private String partnerpuccharge;

	public void setPartnerpuccharge(String partnerpuccharge) {
		this.partnerpuccharge = partnerpuccharge;
	}
	public String getPartnerpuccharge( ) {
		return this.partnerpuccharge;
	}

}
