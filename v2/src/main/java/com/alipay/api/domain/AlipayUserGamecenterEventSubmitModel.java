package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小游戏用户事件上报
 *
 * @author auto create
 * @since 1.0, 2025-08-25 11:26:27
 */
public class AlipayUserGamecenterEventSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7814782123853233463L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 在第三方游戏中，用户完成事件的渠道。
	 */
	@ApiField("event_finish_channel")
	private String eventFinishChannel;

	/**
	 * 在第三方游戏中，用户在游戏中完成该事件的时间。
	 */
	@ApiField("event_finish_date")
	private Date eventFinishDate;

	/**
	 * 在第三方游戏中，用户在游戏中的事件id。
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 数据的全局唯一标识。用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 传入事件关联的属性集合，以map的形式传入。key为属性id，value为属性的值。
	 */
	@ApiListField("property_map")
	@ApiField("ext_info_map")
	private List<ExtInfoMap> propertyMap;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getEventFinishChannel() {
		return this.eventFinishChannel;
	}
	public void setEventFinishChannel(String eventFinishChannel) {
		this.eventFinishChannel = eventFinishChannel;
	}

	public Date getEventFinishDate() {
		return this.eventFinishDate;
	}
	public void setEventFinishDate(Date eventFinishDate) {
		this.eventFinishDate = eventFinishDate;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<ExtInfoMap> getPropertyMap() {
		return this.propertyMap;
	}
	public void setPropertyMap(List<ExtInfoMap> propertyMap) {
		this.propertyMap = propertyMap;
	}

}
