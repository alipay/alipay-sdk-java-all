package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.userinfo.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 20:52:45
 */
public class AlipayFundUserinfoCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 6463596225245784795L;

	/** 
	 * 是否校验通过
true: 通过
false:不通过
	 */
	@ApiField("is_pass")
	private Boolean isPass;

	public void setIsPass(Boolean isPass) {
		this.isPass = isPass;
	}
	public Boolean getIsPass( ) {
		return this.isPass;
	}

}
