package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpExecuteDefendantDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.executedefendant.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:42
 */
public class ZhimaCreditEpDossierExecutedefendantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4837943528382848339L;

	/** 
	 * 企业被执行人内容
	 */
	@ApiField("data")
	private EpExecuteDefendantDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpExecuteDefendantDataInfo data) {
		this.data = data;
	}
	public EpExecuteDefendantDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
