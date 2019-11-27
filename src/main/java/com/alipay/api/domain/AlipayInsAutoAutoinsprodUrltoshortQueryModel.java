package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝长链接转短链接服务
 *
 * @author auto create
 * @since 1.0, 2019-06-16 15:24:26
 */
public class AlipayInsAutoAutoinsprodUrltoshortQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1577912715451861698L;

	/**
	 * 必须是支付宝的长链接
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * 调用者身份标识
	 */
	@ApiField("invoker")
	private Invoker invoker;

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public Invoker getInvoker() {
		return this.invoker;
	}
	public void setInvoker(Invoker invoker) {
		this.invoker = invoker;
	}

}
