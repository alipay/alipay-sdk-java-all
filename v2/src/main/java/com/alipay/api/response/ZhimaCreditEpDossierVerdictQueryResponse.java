package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpVerdictDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.verdict.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:43
 */
public class ZhimaCreditEpDossierVerdictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1519732749711328528L;

	/** 
	 * 企业裁判文书内容
	 */
	@ApiField("data")
	private EpVerdictDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpVerdictDataInfo data) {
		this.data = data;
	}
	public EpVerdictDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
