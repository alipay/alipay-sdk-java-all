package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SinglePayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.direct.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:26:46
 */
public class AlipayMicropayOrderDirectPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3417692422816754635L;

	/** 
	 * 单笔直接支付返回结果
	 */
	@ApiField("single_pay_detail")
	private SinglePayDetail singlePayDetail;

	public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
		this.singlePayDetail = singlePayDetail;
	}
	public SinglePayDetail getSinglePayDetail( ) {
		return this.singlePayDetail;
	}

}
