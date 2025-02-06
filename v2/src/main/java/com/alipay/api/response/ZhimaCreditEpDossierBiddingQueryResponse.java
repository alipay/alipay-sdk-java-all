package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepBiddingDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.bidding.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 09:57:22
 */
public class ZhimaCreditEpDossierBiddingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4614962249916655881L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepBiddingDataInfo data;

	public void setData(ZmepBiddingDataInfo data) {
		this.data = data;
	}
	public ZmepBiddingDataInfo getData( ) {
		return this.data;
	}

}
