package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.name.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:56:49
 */
public class AlipayOpenMiniBaseinfoNameCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4722681215883236929L;

	/** 
	 * 校验结果code
	 */
	@ApiField("check_code")
	private String checkCode;

	/** 
	 * 校验说明
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
