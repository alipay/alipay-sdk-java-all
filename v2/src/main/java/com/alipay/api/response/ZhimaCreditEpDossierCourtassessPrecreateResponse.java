package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.courtassess.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:32:56
 */
public class ZhimaCreditEpDossierCourtassessPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4779536127682231873L;

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
