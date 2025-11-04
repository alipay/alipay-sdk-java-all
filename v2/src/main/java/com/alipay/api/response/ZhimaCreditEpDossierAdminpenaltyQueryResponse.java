package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpAdminPenaltyDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.adminpenalty.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierAdminpenaltyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3798636894352243953L;

	/** 
	 * 企业行政处罚内容
	 */
	@ApiField("data")
	private EpAdminPenaltyDataInfo data;

	public void setData(EpAdminPenaltyDataInfo data) {
		this.data = data;
	}
	public EpAdminPenaltyDataInfo getData( ) {
		return this.data;
	}

}
