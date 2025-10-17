package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpDishonestDefendantDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.dishonestdefendant.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierDishonestdefendantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7721778343581433184L;

	/** 
	 * 企业失信被执行人内容
	 */
	@ApiField("data")
	private EpDishonestDefendantDataInfo data;

	public void setData(EpDishonestDefendantDataInfo data) {
		this.data = data;
	}
	public EpDishonestDefendantDataInfo getData( ) {
		return this.data;
	}

}
