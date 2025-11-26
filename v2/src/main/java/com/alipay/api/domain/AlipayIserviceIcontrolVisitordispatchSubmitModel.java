package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 向星云调度提交访客
 *
 * @author auto create
 * @since 1.0, 2025-11-04 10:42:38
 */
public class AlipayIserviceIcontrolVisitordispatchSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2856719625155214258L;

	/**
	 * 业务包code
	 */
	@ApiField("biz_package_code")
	private String bizPackageCode;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 其他信息。如小二的身份标签、用户诉求，问题类目，标准问题
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 转接前的坐席ID
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
	 * 队列优先级
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 转接坐席ID
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 坐席类型
	 */
	@ApiField("seat_type")
	private String seatType;

	/**
	 * 服务唯一标识
	 */
	@ApiField("service_uniq_code")
	private String serviceUniqCode;

	/**
	 * 转接技能组id
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 转接技能组类型：工作台技能组 CLIVE_GROUP
	 */
	@ApiField("skill_group_type")
	private String skillGroupType;

	/**
	 * 来源系统
	 */
	@ApiField("source_sys")
	private String sourceSys;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 访客ID，REALID类型为2066等。ANONYMOUSE类型为88888888
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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
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

	public String getSourceSys() {
		return this.sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
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
