package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗支付场景营销触发
 *
 * @author auto create
 * @since 1.0, 2025-11-18 10:17:42
 */
public class AlipayPcreditHuabeiPaysceneMarketingTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 7347324177345916538L;

	/**
	 * 支付宝用户的userId

	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务场景码值，如：飞猪信用住
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 营销渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 事件码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识

	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Date getTransDate() {
		return this.transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

}
