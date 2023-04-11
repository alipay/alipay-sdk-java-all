package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.report.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:02:16
 */
public class AlipayCommerceIotDeviceReportUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6682867543643181626L;

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
