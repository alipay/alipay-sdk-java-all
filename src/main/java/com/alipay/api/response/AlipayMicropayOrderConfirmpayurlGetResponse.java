package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SinglePayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.confirmpayurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMicropayOrderConfirmpayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6313852832796441415L;

	/** 
	 * SinglePayDetail信息
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
