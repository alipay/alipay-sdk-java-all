package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LinkTypeListResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.linktype.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-18 15:11:40
 */
public class AlipayDigitalmgmtLinktypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8152196379719179569L;

	/** 
	 * 环节类型信息列表
	 */
	@ApiField("link_type_list_result")
	private LinkTypeListResult linkTypeListResult;

	public void setLinkTypeListResult(LinkTypeListResult linkTypeListResult) {
		this.linkTypeListResult = linkTypeListResult;
	}
	public LinkTypeListResult getLinkTypeListResult( ) {
		return this.linkTypeListResult;
	}

}
