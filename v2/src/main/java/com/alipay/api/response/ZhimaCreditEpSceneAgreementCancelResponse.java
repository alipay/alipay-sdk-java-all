package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.agreement.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:59:02
 */
public class ZhimaCreditEpSceneAgreementCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6191651182347788486L;

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
