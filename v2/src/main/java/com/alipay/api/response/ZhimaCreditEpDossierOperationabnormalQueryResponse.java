package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpOperationAbnormalDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.operationabnormal.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:23
 */
public class ZhimaCreditEpDossierOperationabnormalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1286681848941989479L;

	/** 
	 * 企业经营异常内容
	 */
	@ApiField("data")
	private EpOperationAbnormalDataInfo data;

	public void setData(EpOperationAbnormalDataInfo data) {
		this.data = data;
	}
	public EpOperationAbnormalDataInfo getData( ) {
		return this.data;
	}

}
