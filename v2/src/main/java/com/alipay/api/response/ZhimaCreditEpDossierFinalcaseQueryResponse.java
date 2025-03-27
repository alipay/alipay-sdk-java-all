package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpFinalCaseDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.finalcase.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierFinalcaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4844779639333489185L;

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
