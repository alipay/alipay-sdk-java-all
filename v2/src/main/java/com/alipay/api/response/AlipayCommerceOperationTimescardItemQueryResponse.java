package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TimeCardItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:52:30
 */
public class AlipayCommerceOperationTimescardItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2528246613419489197L;

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
