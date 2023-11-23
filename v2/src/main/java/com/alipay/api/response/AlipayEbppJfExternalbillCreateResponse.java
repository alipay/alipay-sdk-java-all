package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PucExternalOrderDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.externalbill.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-16 11:36:49
 */
public class AlipayEbppJfExternalbillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4469735586575444815L;

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
