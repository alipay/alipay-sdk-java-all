package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业四要素扫脸认证
 *
 * @author auto create
 * @since 1.0, 2026-10-16 21:02:56
 */
public class AlipayTradeSaasEnterprisecertifyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8363214215449953322L;

	/**
	 * 外部请求幂等单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 认证完成后的客户回跳地址，对客字段名为 out_return_url
	 */
	@ApiField("out_return_url")
	private String outReturnUrl;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutReturnUrl() {
		return this.outReturnUrl;
	}
	public void setOutReturnUrl(String outReturnUrl) {
		this.outReturnUrl = outReturnUrl;
	}

}
