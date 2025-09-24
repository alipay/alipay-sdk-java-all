package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁售后赔付信息
 *
 * @author auto create
 * @since 1.0, 2025-08-22 13:47:48
 */
public class AftersaleCompensationInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1282733569527957986L;

	/**
	 * 赔付支付外部请求号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝服务器主动通知商户服务器里指定的页面http/https路径
	 */
	@ApiField("pay_notify_url")
	private String payNotifyUrl;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayNotifyUrl() {
		return this.payNotifyUrl;
	}
	public void setPayNotifyUrl(String payNotifyUrl) {
		this.payNotifyUrl = payNotifyUrl;
	}

}
