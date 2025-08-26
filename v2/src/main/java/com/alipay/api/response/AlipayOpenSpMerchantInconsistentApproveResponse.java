package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.merchant.inconsistent.approve response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 10:56:59
 */
public class AlipayOpenSpMerchantInconsistentApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3535432693934255668L;

	/** 
	 * 申请单据编号
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
