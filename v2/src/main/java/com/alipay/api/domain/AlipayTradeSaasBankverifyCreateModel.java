package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业打款认证
 *
 * @author auto create
 * @since 1.0, 2026-10-16 21:02:56
 */
public class AlipayTradeSaasBankverifyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1691375782971535343L;

	/**
	 * 客户侧请求幂等号，同一商户应用内保持唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 可选 HTTPS回跳地址，认证完成之后可以按照指定地址回跳
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
