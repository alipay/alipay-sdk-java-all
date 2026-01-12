package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息模型
 *
 * @author auto create
 * @since 1.0, 2025-05-13 17:30:56
 */
public class PayInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5336772683849214781L;

	/**
	 * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分隔，与enable_pay_channels互斥  <a href="https://opendocs.alipay.com/open/common/wifww7">渠道列表</a>
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 指定支付渠道。 用户只能使用指定的渠道进行支付，多个渠道以逗号分隔。  与disable_pay_channels互斥，支持传入的值：<a href="https://opendocs.alipay.com/open/common/wifww7">渠道列表</a>。  注：如果传入了指定支付渠道，则用户只能用指定内的渠道支付，包括营销渠道也要指定才能使用。该参数可能导致用户支付受限，慎用。
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 订单支付渠道，空值默认为支付宝支付
	 */
	@ApiField("payment_biz_type")
	private String paymentBizType;

	/**
	 * 支付方式，到付、无需支付等特殊场景下传入，到付和无需支付都会直接推进订单到已支付状态。
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	public String getDisablePayChannels() {
		return this.disablePayChannels;
	}
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

	public String getEnablePayChannels() {
		return this.enablePayChannels;
	}
	public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
	}

	public String getPaymentBizType() {
		return this.paymentBizType;
	}
	public void setPaymentBizType(String paymentBizType) {
		this.paymentBizType = paymentBizType;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
