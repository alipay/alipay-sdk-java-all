package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 15:01:39
 */
public class DatadigitalFincloudFinsaasDesignPageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7784928945242666582L;

	/** 
	 * 页面code
	 */
	@ApiField("page_code")
	private String pageCode;

	/** 
	 * 页面详情
	 */
	@ApiField("page_info")
	private PageInfoDTO pageInfo;

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}
	public String getPageCode( ) {
		return this.pageCode;
	}

	public void setPageInfo(PageInfoDTO pageInfo) {
		this.pageInfo = pageInfo;
	}
	public PageInfoDTO getPageInfo( ) {
		return this.pageInfo;
	}

}
