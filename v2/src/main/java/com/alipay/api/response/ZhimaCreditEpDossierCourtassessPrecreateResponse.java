package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.courtassess.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 08:09:57
 */
public class ZhimaCreditEpDossierCourtassessPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4155262419483213185L;

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
