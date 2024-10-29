package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:34
 */
public class DatadigitalFincloudFinsaasDesignPagePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3417317473627737978L;

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
