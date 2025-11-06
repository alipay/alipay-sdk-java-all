package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpLegalAssistDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.legalassist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:52:21
 */
public class ZhimaCreditEpDossierLegalassistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6429629112721734298L;

	/** 
	 * 企业司法协助内容
	 */
	@ApiField("data")
	private EpLegalAssistDataInfo data;

	public void setData(EpLegalAssistDataInfo data) {
		this.data = data;
	}
	public EpLegalAssistDataInfo getData( ) {
		return this.data;
	}

}
