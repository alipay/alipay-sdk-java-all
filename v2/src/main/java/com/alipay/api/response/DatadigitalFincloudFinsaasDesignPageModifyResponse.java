package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:33
 */
public class DatadigitalFincloudFinsaasDesignPageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3827475542583874894L;

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
