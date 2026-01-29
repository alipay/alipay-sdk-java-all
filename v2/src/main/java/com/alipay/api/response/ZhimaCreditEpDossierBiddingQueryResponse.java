package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepBiddingDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.bidding.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:52:41
 */
public class ZhimaCreditEpDossierBiddingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7872845226386129682L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepBiddingDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(ZmepBiddingDataInfo data) {
		this.data = data;
	}
	public ZmepBiddingDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
