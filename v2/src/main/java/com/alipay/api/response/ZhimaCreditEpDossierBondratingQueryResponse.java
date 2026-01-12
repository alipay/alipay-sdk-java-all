package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmEpBondRatingDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.bondrating.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:52:41
 */
public class ZhimaCreditEpDossierBondratingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4135136559972936792L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmEpBondRatingDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(ZmEpBondRatingDataInfo data) {
		this.data = data;
	}
	public ZmEpBondRatingDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
