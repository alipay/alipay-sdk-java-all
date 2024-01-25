package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息模型
 *
 * @author auto create
 * @since 1.0, 2023-12-11 00:08:48
 */
public class PayInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7649527872634957646L;

	/**
	 * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分隔，与enable_pay_channels互斥  渠道列表：https://opendocs.alipay.com/open/common/wifww7
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 指定支付渠道。 用户只能使用指定的渠道进行支付，多个渠道以逗号分隔。  与disable_pay_channels互斥，支持传入的值：渠道列表：https://opendocs.alipay.com/open/common/wifww7。  注：如果传入了指定支付渠道，则用户只能用指定内的渠道支付，包括营销渠道也要指定才能使用。该参数可能导致用户支付受限，慎用。
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

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

}
