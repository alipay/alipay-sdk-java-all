package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.recycle.billing.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-26 15:52:04
 */
public class AlipayCommerceOperationRecycleBillingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4481969973653237844L;

	/** 
	 * 是否传递成功
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
