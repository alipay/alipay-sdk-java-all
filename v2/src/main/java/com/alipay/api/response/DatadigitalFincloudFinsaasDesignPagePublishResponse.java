package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:57:51
 */
public class DatadigitalFincloudFinsaasDesignPagePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5139249817938326324L;

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
