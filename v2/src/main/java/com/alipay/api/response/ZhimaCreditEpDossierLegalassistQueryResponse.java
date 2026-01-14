package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpLegalAssistDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.legalassist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:42
 */
public class ZhimaCreditEpDossierLegalassistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3485439786514131743L;

	/** 
	 * 企业司法协助内容
	 */
	@ApiField("data")
	private EpLegalAssistDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpLegalAssistDataInfo data) {
		this.data = data;
	}
	public EpLegalAssistDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
