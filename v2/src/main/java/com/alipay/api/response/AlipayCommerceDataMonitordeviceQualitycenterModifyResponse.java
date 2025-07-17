package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.monitordevice.qualitycenter.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 13:32:28
 */
public class AlipayCommerceDataMonitordeviceQualitycenterModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2557182823684452856L;

	/** 
	 * error_detail，出错的情况下返回，包含具体信息。
	 */
	@ApiField("error_detail")
	private String errorDetail;

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	public String getErrorDetail( ) {
		return this.errorDetail;
	}

}
