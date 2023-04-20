package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 19:38:18
 */
public class DatadigitalFincloudFinsaasDesignPageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5158735713859511168L;

	/** 
	 * 创建成功的返回值
	 */
	@ApiField("page_code")
	private String pageCode;

	/** 
	 * 数据库id
	 */
	@ApiField("page_id")
	private Long pageId;

	/** 
	 * page对象
	 */
	@ApiField("page_info")
	private PageInfoDTO pageInfo;

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

	public void setPageInfo(PageInfoDTO pageInfo) {
		this.pageInfo = pageInfo;
	}
	public PageInfoDTO getPageInfo( ) {
		return this.pageInfo;
	}

}
