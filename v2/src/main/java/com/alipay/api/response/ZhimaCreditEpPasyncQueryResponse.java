package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayFlowModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.pasync.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 11:07:25
 */
public class ZhimaCreditEpPasyncQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6334151872281567796L;

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
