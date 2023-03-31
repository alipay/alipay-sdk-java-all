package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.basename.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:58:41
 */
public class AlipayOpenMiniInnerBasenameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6766914281712539421L;

	/** 
	 * 该接口是提供给雨燕 只支持内部小程序调用的 查询app_name的接口
	 */
	@ApiField("app_name")
	private String appName;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

}
