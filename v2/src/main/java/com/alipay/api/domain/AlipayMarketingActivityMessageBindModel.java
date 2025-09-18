package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置券事件通知应用
 *
 * @author auto create
 * @since 1.0, 2025-09-03 10:23:25
 */
public class AlipayMarketingActivityMessageBindModel extends AlipayObject {

	private static final long serialVersionUID = 2675936636116191861L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 支付宝商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户提供的用于接收营销事件通知的小程序ID
	 */
	@ApiField("notify_appid")
	private String notifyAppid;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getNotifyAppid() {
		return this.notifyAppid;
	}
	public void setNotifyAppid(String notifyAppid) {
		this.notifyAppid = notifyAppid;
	}

}
