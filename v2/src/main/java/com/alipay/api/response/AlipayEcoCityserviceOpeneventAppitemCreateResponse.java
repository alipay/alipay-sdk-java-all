package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.openevent.appitem.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 11:16:01
 */
public class AlipayEcoCityserviceOpeneventAppitemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2137962787414369153L;

	/** 
	 * 商品在光华侧的唯一标识
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
