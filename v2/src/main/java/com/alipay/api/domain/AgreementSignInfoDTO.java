package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户个人协议签约信息
 *
 * @author auto create
 * @since 1.0, 2024-09-01 22:13:15
 */
public class AgreementSignInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1774977525134821491L;

	/**
	 * 用户个人协议签约消息通知地址，接入租赁快捷下单商户可通过指定该地址监听支付宝侧用户个人协议签约成功消息
	 */
	@ApiField("sign_notify_url")
	private String signNotifyUrl;

	/**
	 * 签约成功后的跳转页面地址
	 */
	@ApiField("sign_return_url")
	private String signReturnUrl;

	public String getSignNotifyUrl() {
		return this.signNotifyUrl;
	}
	public void setSignNotifyUrl(String signNotifyUrl) {
		this.signNotifyUrl = signNotifyUrl;
	}

	public String getSignReturnUrl() {
		return this.signReturnUrl;
	}
	public void setSignReturnUrl(String signReturnUrl) {
		this.signReturnUrl = signReturnUrl;
	}

}
