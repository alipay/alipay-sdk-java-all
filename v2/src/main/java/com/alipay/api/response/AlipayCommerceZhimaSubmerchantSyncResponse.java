package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.zhima.submerchant.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:26:52
 */
public class AlipayCommerceZhimaSubmerchantSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3867587364666925136L;

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
