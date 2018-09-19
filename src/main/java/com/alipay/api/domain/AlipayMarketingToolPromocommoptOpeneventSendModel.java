package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 惠支付通用开放平台事件接入接口
 *
 * @author auto create
 * @since 1.0, 2018-07-30 15:26:46
 */
public class AlipayMarketingToolPromocommoptOpeneventSendModel extends AlipayObject {

	private static final long serialVersionUID = 8287343762842373813L;

	/**
	 * 外部事件发生时间，必须是（yyyy-MM-dd HH:mm:ss）格式
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 唯一事件编码，用来区分不同的事件类型。事件类型是给定的，当前事件类型只有PARKING（停车场事件）一种
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 每一个事件码对应的扩展信息，是Map<String,String>的类型JSON格式化的字符串。
事件类型为PARKING的KEY如下：
parking_lot_id：停车场ID（必填）
action： IN（进场）、OUT 出场（必填）
content_id：内容ID（必填）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 事件发生的纬度信息。经度信息和纬度信息必须同时存在，要么都填，要么都不填。
	 */
	@ApiField("latitude")
	private Long latitude;

	/**
	 * 事件发生的经度信息。经度信息和纬度信息必须同时存在，要么都填，要么都不填。
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 事件唯一编号，用来做幂等控制。每一次用户在商户所发生的事件，out_biz_no都不能一样。比如用户每次进入停车场、离开停车场的out_biz_no不能一样。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getLatitude() {
		return this.latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
