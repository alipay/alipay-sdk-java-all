package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.baseorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 18:23:05
 */
public class AlipayOpenSearchBaseorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6722357988377553752L;

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
