package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CdpDisplayContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.mall.cdp.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailMallCdpQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1577558676181697121L;

	/** 
	 * 投放内容列表
	 */
	@ApiListField("cdp_content_list")
	@ApiField("cdp_display_content")
	private List<CdpDisplayContent> cdpContentList;

	public void setCdpContentList(List<CdpDisplayContent> cdpContentList) {
		this.cdpContentList = cdpContentList;
	}
	public List<CdpDisplayContent> getCdpContentList( ) {
		return this.cdpContentList;
	}

}
