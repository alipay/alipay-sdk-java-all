package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.category.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-29 14:27:49
 */
public class AlipayCommerceLifeserviceCategorySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7621113673198144829L;

	/** 
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
