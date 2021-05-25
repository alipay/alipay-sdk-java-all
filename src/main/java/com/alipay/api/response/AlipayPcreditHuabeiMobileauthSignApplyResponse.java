package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.sign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-13 15:41:18
 */
public class AlipayPcreditHuabeiMobileauthSignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3183411987678273557L;

	/** 
	 * 模板查询返回JSON信息，参考 PcreditAuthSignApplyResult
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
