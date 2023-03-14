package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:03:49
 */
public class AlipayAssetPointPointprodBudgetlibModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6316976849978998433L;

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
