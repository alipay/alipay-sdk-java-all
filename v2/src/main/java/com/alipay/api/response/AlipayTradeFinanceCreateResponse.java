package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.finance.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-26 14:17:42
 */
public class AlipayTradeFinanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5442865833676856951L;

	/** 
	 * 扩展字段，返回保单号
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
