package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.zhima.submerchant.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-13 10:56:49
 */
public class AlipayCommerceZhimaSubmerchantSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7751817932937174284L;

	/** 
	 * status用于展示进件结果
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
