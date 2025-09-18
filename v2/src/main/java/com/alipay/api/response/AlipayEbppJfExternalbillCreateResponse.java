package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PucExternalOrderDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.externalbill.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-17 17:22:26
 */
public class AlipayEbppJfExternalbillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4651211478131552992L;

	/** 
	 * 交易明细
	 */
	@ApiField("trade_detail")
	private PucExternalOrderDetailInfo tradeDetail;

	public void setTradeDetail(PucExternalOrderDetailInfo tradeDetail) {
		this.tradeDetail = tradeDetail;
	}
	public PucExternalOrderDetailInfo getTradeDetail( ) {
		return this.tradeDetail;
	}

}
