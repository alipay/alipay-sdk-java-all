package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.return response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 16:49:21
 */
public class AlipayAssetPointPointprodBudgetlibReturnResponse extends AlipayResponse {

	private static final long serialVersionUID = 8232736548321652491L;

	/** 
	 * 预算库回收失败时的错误信息
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
