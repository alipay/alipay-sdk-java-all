package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.report.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-12 20:00:26
 */
public class AlipayCommerceIotDeviceReportUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7771456691837292418L;

	/** 
	 * 是否上传成功
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
