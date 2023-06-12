package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.baseorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:41:53
 */
public class AlipayOpenSearchBaseorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1513474138627118323L;

	/** 
	 * 工单id
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
