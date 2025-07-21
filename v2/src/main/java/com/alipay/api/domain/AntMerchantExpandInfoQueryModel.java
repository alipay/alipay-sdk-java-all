package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁商户信息查询接口
 *
 * @author auto create
 * @since 1.0, 2021-12-07 09:37:22
 */
public class AntMerchantExpandInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3862462188514612314L;

	/**
	 * 商户号，目前是商户pid
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

}
