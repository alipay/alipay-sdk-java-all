package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.templatetext.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:30:04
 */
public class AlipayPcreditHuabeiMobileauthTemplatetextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2811999788593293839L;

	/** 
	 * 模板查询返回JSON信息，参考 PcreditRpcBaseResult<MemberTemplate>
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
