package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.openevent.app.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:36:36
 */
public class AlipayEcoCityserviceOpeneventAppCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262979489975865822L;

	/** 
	 * 服务入驻后在光华平台的唯一标识，可以通过该标识进行服务的信息变更和状态变更。报错的情况下该字段没有值
	 */
	@ApiField("app_code")
	private String appCode;

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getAppCode( ) {
		return this.appCode;
	}

}
