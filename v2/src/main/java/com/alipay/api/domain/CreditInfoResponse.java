package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用创单相关参数
 *
 * @author auto create
 * @since 1.0, 2024-09-25 10:28:20
 */
public class CreditInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3355619648784148577L;

	/**
	 * 芝麻信用下单页面地址
	 */
	@ApiField("credit_page_link")
	private String creditPageLink;

	public String getCreditPageLink() {
		return this.creditPageLink;
	}
	public void setCreditPageLink(String creditPageLink) {
		this.creditPageLink = creditPageLink;
	}

}
