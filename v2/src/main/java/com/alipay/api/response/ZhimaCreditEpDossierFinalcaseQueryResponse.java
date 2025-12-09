package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpFinalCaseDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.finalcase.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:07:09
 */
public class ZhimaCreditEpDossierFinalcaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5523177358237793755L;

	/** 
	 * 企业终本案件内容
	 */
	@ApiField("data")
	private EpFinalCaseDataInfo data;

	public void setData(EpFinalCaseDataInfo data) {
		this.data = data;
	}
	public EpFinalCaseDataInfo getData( ) {
		return this.data;
	}

}
