package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.testmanjiang.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-07 11:31:46
 */
public class AlipayEcoTestmanjiangGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8821744615431477744L;

	/** 
	 * 详细地址
	 */
	@ApiField("addr")
	private String addr;

	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr( ) {
		return this.addr;
	}

}
