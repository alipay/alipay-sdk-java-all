package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmEpBondRatingDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.bondrating.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-21 10:27:24
 */
public class ZhimaCreditEpDossierBondratingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1726852859711411422L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmEpBondRatingDataInfo data;

	public void setData(ZmEpBondRatingDataInfo data) {
		this.data = data;
	}
	public ZmEpBondRatingDataInfo getData( ) {
		return this.data;
	}

}
