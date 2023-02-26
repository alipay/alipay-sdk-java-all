package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:35:17
 */
public class AlipayPcreditHuabeiMobileauthTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7479813118374887568L;

	/** 
	 * 模板查询返回JSON信息，参考
PcreditRpcBaseResult<MobileMemberTemplateInfoVO>
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
