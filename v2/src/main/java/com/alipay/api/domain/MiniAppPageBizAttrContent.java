package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序页面业务属性结构体
 *
 * @author auto create
 * @since 1.0, 2024-12-05 11:50:16
 */
public class MiniAppPageBizAttrContent extends AlipayObject {

	private static final long serialVersionUID = 7832955476811941621L;

	/**
	 * 渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 事由id
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * 使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

}
