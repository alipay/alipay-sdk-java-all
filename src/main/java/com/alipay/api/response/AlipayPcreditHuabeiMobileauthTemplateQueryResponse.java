package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 14:48:23
 */
public class AlipayPcreditHuabeiMobileauthTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1578393821218615791L;

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
