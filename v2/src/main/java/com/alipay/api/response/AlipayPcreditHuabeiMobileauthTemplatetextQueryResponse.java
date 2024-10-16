package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.templatetext.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 11:34:02
 */
public class AlipayPcreditHuabeiMobileauthTemplatetextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4349153548966717672L;

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
