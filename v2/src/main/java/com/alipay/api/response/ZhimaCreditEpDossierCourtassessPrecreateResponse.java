package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.courtassess.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:00:26
 */
public class ZhimaCreditEpDossierCourtassessPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2753937817564325979L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
