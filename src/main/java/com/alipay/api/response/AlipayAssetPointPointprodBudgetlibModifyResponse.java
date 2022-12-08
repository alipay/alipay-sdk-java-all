package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:39:40
 */
public class AlipayAssetPointPointprodBudgetlibModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3518394731662237152L;

	/** 
	 * 预算库有效期修改失败时的错误信息
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
