package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpConsumeRestrictionDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.consumerestriction.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:12:42
 */
public class ZhimaCreditEpDossierConsumerestrictionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8375875836764964651L;

	/** 
	 * 企业限制高消费内容
	 */
	@ApiField("data")
	private EpConsumeRestrictionDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpConsumeRestrictionDataInfo data) {
		this.data = data;
	}
	public EpConsumeRestrictionDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
