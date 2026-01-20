package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpBusinessCompetitionDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.businesscompetition.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:42
 */
public class ZhimaCreditEpDossierBusinesscompetitionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4615476139582891364L;

	/** 
	 * 企业业务竞争内容
	 */
	@ApiField("data")
	private EpBusinessCompetitionDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpBusinessCompetitionDataInfo data) {
		this.data = data;
	}
	public EpBusinessCompetitionDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
