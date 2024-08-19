package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:33
 */
public class DatadigitalFincloudFinsaasDesignPageApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8643385795372853865L;

	/** 
	 * 页面code
	 */
	@ApiField("page_code")
	private String pageCode;

	/** 
	 * 页面新的id
	 */
	@ApiField("page_id")
	private Long pageId;

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}
	public String getPageCode( ) {
		return this.pageCode;
	}

	public void setPageId(Long pageId) {
		this.pageId = pageId;
	}
	public Long getPageId( ) {
		return this.pageId;
	}

}
