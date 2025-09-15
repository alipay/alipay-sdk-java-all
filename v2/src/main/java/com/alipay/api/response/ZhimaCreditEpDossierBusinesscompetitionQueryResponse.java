package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpBusinessCompetitionDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.businesscompetition.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierBusinesscompetitionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1538371641656792237L;

	/** 
	 * 企业业务竞争内容
	 */
	@ApiField("data")
	private EpBusinessCompetitionDataInfo data;

	public void setData(EpBusinessCompetitionDataInfo data) {
		this.data = data;
	}
	public EpBusinessCompetitionDataInfo getData( ) {
		return this.data;
	}

}
