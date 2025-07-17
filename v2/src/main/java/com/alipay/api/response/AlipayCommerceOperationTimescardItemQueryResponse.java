package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TimeCardItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 10:21:47
 */
public class AlipayCommerceOperationTimescardItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4171572282921836844L;

	/** 
	 * 次卡商品信息
	 */
	@ApiField("data")
	private TimeCardItemInfo data;

	public void setData(TimeCardItemInfo data) {
		this.data = data;
	}
	public TimeCardItemInfo getData( ) {
		return this.data;
	}

}
