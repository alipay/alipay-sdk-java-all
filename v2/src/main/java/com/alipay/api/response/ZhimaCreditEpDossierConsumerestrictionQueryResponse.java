package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpConsumeRestrictionDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.consumerestriction.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierConsumerestrictionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5738477831695215866L;

	/** 
	 * 企业限制高消费内容
	 */
	@ApiField("data")
	private EpConsumeRestrictionDataInfo data;

	public void setData(EpConsumeRestrictionDataInfo data) {
		this.data = data;
	}
	public EpConsumeRestrictionDataInfo getData( ) {
		return this.data;
	}

}
