package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZolozIdentificationCustomerVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2238686999247192211L;

	/** 
	 * 扩展业务结果
	 */
	@ApiField("extern_info")
	private String externInfo;

	/** 
	 * 认证是否通过，通过为true，其他情况为false。请通过返回码分析不通过的具体原因
	 */
	@ApiField("passed")
	private String passed;

	public void setExternInfo(String externInfo) {
		this.externInfo = externInfo;
	}
	public String getExternInfo( ) {
		return this.externInfo;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
