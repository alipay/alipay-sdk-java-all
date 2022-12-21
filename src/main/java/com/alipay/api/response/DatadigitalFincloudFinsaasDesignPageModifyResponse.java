package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:20:22
 */
public class DatadigitalFincloudFinsaasDesignPageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6556722482146582439L;

	/** 
	 * page_code
	 */
	@ApiField("page_code")
	private String pageCode;

	/** 
	 * 新的页面id
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
