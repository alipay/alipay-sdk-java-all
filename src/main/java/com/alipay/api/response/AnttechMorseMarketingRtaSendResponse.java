package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.rta.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-15 14:06:48
 */
public class AnttechMorseMarketingRtaSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6831157375798926998L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 活动id描述具体给用户发奖的活动
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/** 
	 * 发奖订单号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/** 
	 * 发奖订单时间
	 */
	@ApiField("send_order_time")
	private Date sendOrderTime;

	/** 
	 * 发放流水状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignId( ) {
		return this.campaignId;
	}

	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}
	public String getSendOrderId( ) {
		return this.sendOrderId;
	}

	public void setSendOrderTime(Date sendOrderTime) {
		this.sendOrderTime = sendOrderTime;
	}
	public Date getSendOrderTime( ) {
		return this.sendOrderTime;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendStatus( ) {
		return this.sendStatus;
	}

}
