package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LinkTypeListResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.linktype.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:05:55
 */
public class AlipayDigitalmgmtLinktypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4584871894399158753L;

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
