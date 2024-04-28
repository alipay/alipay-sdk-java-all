package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:27:02
 */
public class AlipayMarketingActivityMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4625141852265983858L;

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

	/** 
	 * 修改时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setNotifyAppid(String notifyAppid) {
		this.notifyAppid = notifyAppid;
	}
	public String getNotifyAppid( ) {
		return this.notifyAppid;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime( ) {
		return this.updateTime;
	}

}
