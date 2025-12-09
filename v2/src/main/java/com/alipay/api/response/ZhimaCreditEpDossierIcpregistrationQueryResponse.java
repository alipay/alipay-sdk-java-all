package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpICPRegistrationDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.icpregistration.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:07:10
 */
public class ZhimaCreditEpDossierIcpregistrationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2469978722414482741L;

	/** 
	 * 企业ICP备案内容
	 */
	@ApiField("data")
	private EpICPRegistrationDataInfo data;

	public void setData(EpICPRegistrationDataInfo data) {
		this.data = data;
	}
	public EpICPRegistrationDataInfo getData( ) {
		return this.data;
	}

}
