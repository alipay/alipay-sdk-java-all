package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.agreement.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:49:53
 */
public class ZhimaCreditEpSceneAgreementCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5475588261481328935L;

	/** 
	 * 信用订单号
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}
	public String getCreditOrderNo( ) {
		return this.creditOrderNo;
	}

}
