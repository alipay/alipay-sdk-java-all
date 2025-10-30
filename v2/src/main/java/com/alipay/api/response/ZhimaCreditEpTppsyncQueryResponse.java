package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayFlowModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.tppsync.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 16:12:26
 */
public class ZhimaCreditEpTppsyncQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5747583344642772992L;

	/** 
	 * 支付收单数据集
	 */
	@ApiField("data")
	private PayFlowModel data;

	public void setData(PayFlowModel data) {
		this.data = data;
	}
	public PayFlowModel getData( ) {
		return this.data;
	}

}
