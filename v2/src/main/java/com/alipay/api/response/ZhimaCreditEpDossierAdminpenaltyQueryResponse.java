package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpAdminPenaltyDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.adminpenalty.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:43
 */
public class ZhimaCreditEpDossierAdminpenaltyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4431749813485369115L;

	/** 
	 * 企业行政处罚内容
	 */
	@ApiField("data")
	private EpAdminPenaltyDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpAdminPenaltyDataInfo data) {
		this.data = data;
	}
	public EpAdminPenaltyDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
