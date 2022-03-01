package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.identification.certify response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-10 10:15:54
 */
public class ZhimaCustomerEpIdentificationCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1193449979238374198L;

	/** 
	 * 一次认证的唯一标识，在商户调用认证初始化接口的时候获取，认证完成返回的biz_no和请求的一致。
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
