package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.name.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenMiniBaseinfoNameCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4864653187945666641L;

	/** 
	 * 校验结果code
	 */
	@ApiField("check_code")
	private String checkCode;

	/** 
	 * 名称校验结果详细说明
	 */
	@ApiField("check_memo")
	private String checkMemo;

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public String getCheckCode( ) {
		return this.checkCode;
	}

	public void setCheckMemo(String checkMemo) {
		this.checkMemo = checkMemo;
	}
	public String getCheckMemo( ) {
		return this.checkMemo;
	}

}
