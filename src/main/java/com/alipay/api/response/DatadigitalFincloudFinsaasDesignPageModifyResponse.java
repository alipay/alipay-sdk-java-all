package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 15:01:39
 */
public class DatadigitalFincloudFinsaasDesignPageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4221854973446529388L;

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
