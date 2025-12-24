package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpDishonestDefendantDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.dishonestdefendant.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:42
 */
public class ZhimaCreditEpDossierDishonestdefendantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1688339848918499178L;

	/** 
	 * 企业失信被执行人内容
	 */
	@ApiField("data")
	private EpDishonestDefendantDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpDishonestDefendantDataInfo data) {
		this.data = data;
	}
	public EpDishonestDefendantDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
