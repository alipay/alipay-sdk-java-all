package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单-阿云客服呼入创建模型
 *
 * @author auto create
 * @since 1.0, 2024-04-17 10:14:43
 */
public class CustomeServiceInboundCreateDTO extends AlipayObject {

	private static final long serialVersionUID = 2838275786646191166L;

	/**
	 * 业务包code
	 */
	@ApiField("biz_package_code")
	private String bizPackageCode;

	/**
	 * tntInstId 与channelId二选一。优先使用tntInstId
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 转接前的坐席id
	 */
	@ApiField("origin_seat_id")
	private String originSeatId;

	/**
	 * 转接前的服务唯一标识
	 */
	@ApiField("origin_service_uniq_code")
	private String originServiceUniqCode;

	/**
	 * 电话号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 转接指定坐席id
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 转接坐席类型
	 */
	@ApiField("seat_type")
	private String seatType;

	/**
	 * 服务唯一标识。发生转接需要生成新的唯一标识 --> requestId
	 */
	@ApiField("service_uniq_code")
	private String serviceUniqCode;

	/**
	 * 转接指定技能组id
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 技能组类型
	 */
	@ApiField("skill_group_type")
	private String skillGroupType;

	/**
	 * 访客ID，REALID类型为2088，2066账号ID等，ANONYMOUS为88888888
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * 模式类型
	 */
	@ApiField("visitor_mode")
	private String visitorMode;

	/**
	 * 访客类型
	 */
	@ApiField("visitor_type")
	private String visitorType;

	public String getBizPackageCode() {
		return this.bizPackageCode;
	}
	public void setBizPackageCode(String bizPackageCode) {
		this.bizPackageCode = bizPackageCode;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getOriginSeatId() {
		return this.originSeatId;
	}
	public void setOriginSeatId(String originSeatId) {
		this.originSeatId = originSeatId;
	}

	public String getOriginServiceUniqCode() {
		return this.originServiceUniqCode;
	}
	public void setOriginServiceUniqCode(String originServiceUniqCode) {
		this.originServiceUniqCode = originServiceUniqCode;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSeatId() {
		return this.seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatType() {
		return this.seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getServiceUniqCode() {
		return this.serviceUniqCode;
	}
	public void setServiceUniqCode(String serviceUniqCode) {
		this.serviceUniqCode = serviceUniqCode;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getSkillGroupType() {
		return this.skillGroupType;
	}
	public void setSkillGroupType(String skillGroupType) {
		this.skillGroupType = skillGroupType;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorMode() {
		return this.visitorMode;
	}
	public void setVisitorMode(String visitorMode) {
		this.visitorMode = visitorMode;
	}

	public String getVisitorType() {
		return this.visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

}
