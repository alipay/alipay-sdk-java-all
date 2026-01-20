package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpFinalCaseDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.finalcase.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:41
 */
public class ZhimaCreditEpDossierFinalcaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1372672282599425492L;

	/** 
	 * 企业终本案件内容
	 */
	@ApiField("data")
	private EpFinalCaseDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpFinalCaseDataInfo data) {
		this.data = data;
	}
	public EpFinalCaseDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
