package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * XingshanEmail
 *
 * @author auto create
 * @since 1.0, 2019-10-17 14:10:24
 */
public class XingshanEmail extends AlipayObject {

	private static final long serialVersionUID = 4816941483682492979L;

	/**
	 * 发送给
	 */
	@ApiField("sendTo")
	private String sendTo;

	public String getSendTo() {
		return this.sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

}
