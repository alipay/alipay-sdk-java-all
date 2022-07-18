package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.templatetext.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-19 14:43:52
 */
public class AlipayPcreditHuabeiMobileauthTemplatetextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1125369978471157521L;

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
