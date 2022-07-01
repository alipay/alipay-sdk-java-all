package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.agreement.use response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-27 17:12:55
 */
public class ZhimaCreditEpSceneAgreementUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2781499987922624823L;

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
