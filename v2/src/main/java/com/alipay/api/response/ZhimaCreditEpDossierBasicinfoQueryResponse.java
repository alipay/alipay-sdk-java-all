package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpBusinessBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.basicinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-21 15:47:39
 */
public class ZhimaCreditEpDossierBasicinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6227836198464757671L;

	/** 
	 * 企业工商基本信息
	 */
	@ApiField("data")
	private EpBusinessBasicInfo data;

	public void setData(EpBusinessBasicInfo data) {
		this.data = data;
	}
	public EpBusinessBasicInfo getData( ) {
		return this.data;
	}

}
