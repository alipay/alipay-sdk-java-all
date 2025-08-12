package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.offline response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:35
 */
public class DatadigitalFincloudFinsaasDesignPageOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 6557234388224958263L;

	/** 
	 * 页面code
	 */
	@ApiField("page_code")
	private String pageCode;

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}
	public String getPageCode( ) {
		return this.pageCode;
	}

}
