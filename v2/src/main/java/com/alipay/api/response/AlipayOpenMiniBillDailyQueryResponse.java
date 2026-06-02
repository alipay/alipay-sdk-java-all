package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CertBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bill.daily.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 09:27:44
 */
public class AlipayOpenMiniBillDailyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2236854372678256575L;

	/** 
	 * 查询返回的账单
	 */
	@ApiField("response")
	private CertBillDetail response;

	public void setResponse(CertBillDetail response) {
		this.response = response;
	}
	public CertBillDetail getResponse( ) {
		return this.response;
	}

}
