package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.appkeyword.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-12 11:00:55
 */
public class AlipayOpenSearchAppkeywordApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1444262681117962269L;

	/** 
	 * 提报之后的后台审核工单的id
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
