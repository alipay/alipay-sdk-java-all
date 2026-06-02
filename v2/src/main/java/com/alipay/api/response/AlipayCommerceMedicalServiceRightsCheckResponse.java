package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RightsResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.service.rights.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:49
 */
public class AlipayCommerceMedicalServiceRightsCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4613774136136318453L;

	/** 
	 * 结果数据
	 */
	@ApiField("rights_result")
	private RightsResult rightsResult;

	public void setRightsResult(RightsResult rightsResult) {
		this.rightsResult = rightsResult;
	}
	public RightsResult getRightsResult( ) {
		return this.rightsResult;
	}

}
