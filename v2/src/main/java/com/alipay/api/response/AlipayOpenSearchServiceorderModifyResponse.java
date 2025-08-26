package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.serviceorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:23
 */
public class AlipayOpenSearchServiceorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8737386346853443462L;

	/** 
	 * 申请单的申请单id，applyid
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
