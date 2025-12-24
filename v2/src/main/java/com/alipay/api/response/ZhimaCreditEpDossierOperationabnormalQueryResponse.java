package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpOperationAbnormalDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.operationabnormal.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:43
 */
public class ZhimaCreditEpDossierOperationabnormalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3495594233873699511L;

	/** 
	 * 企业经营异常内容
	 */
	@ApiField("data")
	private EpOperationAbnormalDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpOperationAbnormalDataInfo data) {
		this.data = data;
	}
	public EpOperationAbnormalDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
