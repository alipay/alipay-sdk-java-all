package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpVerdictDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.verdict.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierVerdictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4662278411131252349L;

	/** 
	 * 企业裁判文书内容
	 */
	@ApiField("data")
	private EpVerdictDataInfo data;

	public void setData(EpVerdictDataInfo data) {
		this.data = data;
	}
	public EpVerdictDataInfo getData( ) {
		return this.data;
	}

}
