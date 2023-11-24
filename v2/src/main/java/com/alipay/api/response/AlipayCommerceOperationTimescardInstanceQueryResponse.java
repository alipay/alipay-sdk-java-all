package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TimeCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 06:16:47
 */
public class AlipayCommerceOperationTimescardInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6866645354759552182L;

	/** 
	 * 次卡信息
	 */
	@ApiField("data")
	private TimeCardInfo data;

	public void setData(TimeCardInfo data) {
		this.data = data;
	}
	public TimeCardInfo getData( ) {
		return this.data;
	}

}
