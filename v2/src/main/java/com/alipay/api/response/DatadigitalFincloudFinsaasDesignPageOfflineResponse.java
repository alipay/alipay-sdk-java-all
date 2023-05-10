package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.offline response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 14:11:38
 */
public class DatadigitalFincloudFinsaasDesignPageOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 5244694254623252948L;

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
