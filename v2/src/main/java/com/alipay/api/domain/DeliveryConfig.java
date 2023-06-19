package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放配置
 *
 * @author auto create
 * @since 1.0, 2023-03-31 01:11:18
 */
public class DeliveryConfig extends AlipayObject {

	private static final long serialVersionUID = 3379298148713185836L;

	/**
	 * 活动id。
通过商家券相关接口创建的活动。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAYMENT_RESULT
	 */
	@ApiField("booth_code")
	private String boothCode;

	/**
	 * 可投放的渠道标识. 说明： 针对不同的boot_code，channel值各不相同.接口使用者可以认为channel是不同booth_code展位下的渠道的唯一标识。 例如： booth_code为PAYMENT_RESULT。 channel为某个商户的pid。
	 */
	@ApiField("channel")
	private String channel;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBoothCode() {
		return this.boothCode;
	}
	public void setBoothCode(String boothCode) {
		this.boothCode = boothCode;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
