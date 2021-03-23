package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.applogo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-24 11:04:23
 */
public class AlipayOpenMiniInnerbaseinfoApplogoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2428932673662898945L;

	/** 
	 * 上传图片结果地址
	 */
	@ApiField("app_logo")
	private String appLogo;

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

}
