package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.dynamicinfo.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 20:55:31
 */
public class AlipayMobileDeviceinfoDynamicinfoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343436439799975928L;

	/** 
	 * 同步处理结果
	 */
	@ApiField("operateresult")
	private Boolean operateresult;

	public void setOperateresult(Boolean operateresult) {
		this.operateresult = operateresult;
	}
	public Boolean getOperateresult( ) {
		return this.operateresult;
	}

}
