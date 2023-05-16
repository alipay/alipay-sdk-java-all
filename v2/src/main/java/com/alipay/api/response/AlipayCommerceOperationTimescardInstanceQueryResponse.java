package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TimeCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:56:51
 */
public class AlipayCommerceOperationTimescardInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4255642445618222213L;

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
