package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpICPRegistrationDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.icpregistration.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:41
 */
public class ZhimaCreditEpDossierIcpregistrationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5517524343376688483L;

	/** 
	 * 企业ICP备案内容
	 */
	@ApiField("data")
	private EpICPRegistrationDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpICPRegistrationDataInfo data) {
		this.data = data;
	}
	public EpICPRegistrationDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
