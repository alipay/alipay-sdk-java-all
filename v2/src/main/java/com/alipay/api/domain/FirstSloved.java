package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 首解数据
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:12:18
 */
public class FirstSloved extends AlipayObject {

	private static final long serialVersionUID = 1483236947129925443L;

	/**
	 * 客服2088id
	 */
	@ApiField("agent_alipay_uid")
	private String agentAlipayUid;

	/**
	 * 客服昵称
	 */
	@ApiField("agent_nickname")
	private String agentNickname;

	/**
	 * 均响时长(秒)
	 */
	@ApiField("avg_response_length")
	private String avgResponseLength;

	/**
	 * 回流时间
	 */
	@ApiField("backflow_time")
	private String backflowTime;

	/**
	 * 业务线
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * 二级业务线
	 */
	@ApiField("business_name_level_2")
	private String businessNameLevel2;

	/**
	 * 进线渠道
	 */
	@ApiField("call_in_user_type")
	private String callInUserType;

	/**
	 * 一级类目
	 */
	@ApiField("cat_name_level_1")
	private String catNameLevel1;

	/**
	 * 二级类目
	 */
	@ApiField("cat_name_level_2")
	private String catNameLevel2;

	/**
	 * 三级类目
	 */
	@ApiField("cat_name_level_3")
	private String catNameLevel3;

	/**
	 * 首响时长（秒）
	 */
	@ApiField("first_response_length")
	private String firstResponseLength;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 是否中途断线
	 */
	@ApiField("is_discontinue")
	private String isDiscontinue;

	/**
	 * 是否首解
	 */
	@ApiField("is_first_solved")
	private String isFirstSolved;

	/**
	 * 在线渠道客户进人工是否有说话(热线默认有)
	 */
	@ApiField("is_online_user_speak")
	private String isOnlineUserSpeak;

	/**
	 * 是否派单
	 */
	@ApiField("is_send")
	private String isSend;

	/**
	 * 日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 渠道
	 */
	@ApiField("service_channel")
	private String serviceChannel;

	/**
	 * 话务升级时间(秒)
	 */
	@ApiField("session_upgrade_time")
	private String sessionUpgradeTime;

	/**
	 * 话务升级类型
	 */
	@ApiField("session_upgrade_type")
	private String sessionUpgradeType;

	/**
	 * 转出业务线
	 */
	@ApiField("transfer_business_name")
	private String transferBusinessName;

	/**
	 * 转接或回流二级类目
	 */
	@ApiField("transfer_cat_nam_level_2")
	private String transferCatNamLevel2;

	/**
	 * 转接或回流三级类目
	 */
	@ApiField("transfer_cat_nam_level_3")
	private String transferCatNamLevel3;

	/**
	 * 转接或回流渠道
	 */
	@ApiField("transfer_servive_channel")
	private String transferServiveChannel;

	/**
	 * 转接或回流会话id
	 */
	@ApiField("transfer_session_id")
	private String transferSessionId;

	/**
	 * 转接或回流客服记录订单号
	 */
	@ApiField("transfer_user_order_id")
	private String transferUserOrderId;

	/**
	 * 未首解原因
	 */
	@ApiField("unresolved_reason")
	private String unresolvedReason;

	/**
	 * 升级后创建的工单号
	 */
	@ApiField("upgrade_ticket_id")
	private String upgradeTicketId;

	/**
	 * 客户guid
	 */
	@ApiField("user_guid")
	private String userGuid;

	/**
	 * 客服记录订单号
	 */
	@ApiField("user_order_id")
	private String userOrderId;

	/**
	 * 手机号码
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getAgentAlipayUid() {
		return this.agentAlipayUid;
	}
	public void setAgentAlipayUid(String agentAlipayUid) {
		this.agentAlipayUid = agentAlipayUid;
	}

	public String getAgentNickname() {
		return this.agentNickname;
	}
	public void setAgentNickname(String agentNickname) {
		this.agentNickname = agentNickname;
	}

	public String getAvgResponseLength() {
		return this.avgResponseLength;
	}
	public void setAvgResponseLength(String avgResponseLength) {
		this.avgResponseLength = avgResponseLength;
	}

	public String getBackflowTime() {
		return this.backflowTime;
	}
	public void setBackflowTime(String backflowTime) {
		this.backflowTime = backflowTime;
	}

	public String getBusinessName() {
		return this.businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessNameLevel2() {
		return this.businessNameLevel2;
	}
	public void setBusinessNameLevel2(String businessNameLevel2) {
		this.businessNameLevel2 = businessNameLevel2;
	}

	public String getCallInUserType() {
		return this.callInUserType;
	}
	public void setCallInUserType(String callInUserType) {
		this.callInUserType = callInUserType;
	}

	public String getCatNameLevel1() {
		return this.catNameLevel1;
	}
	public void setCatNameLevel1(String catNameLevel1) {
		this.catNameLevel1 = catNameLevel1;
	}

	public String getCatNameLevel2() {
		return this.catNameLevel2;
	}
	public void setCatNameLevel2(String catNameLevel2) {
		this.catNameLevel2 = catNameLevel2;
	}

	public String getCatNameLevel3() {
		return this.catNameLevel3;
	}
	public void setCatNameLevel3(String catNameLevel3) {
		this.catNameLevel3 = catNameLevel3;
	}

	public String getFirstResponseLength() {
		return this.firstResponseLength;
	}
	public void setFirstResponseLength(String firstResponseLength) {
		this.firstResponseLength = firstResponseLength;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getIsDiscontinue() {
		return this.isDiscontinue;
	}
	public void setIsDiscontinue(String isDiscontinue) {
		this.isDiscontinue = isDiscontinue;
	}

	public String getIsFirstSolved() {
		return this.isFirstSolved;
	}
	public void setIsFirstSolved(String isFirstSolved) {
		this.isFirstSolved = isFirstSolved;
	}

	public String getIsOnlineUserSpeak() {
		return this.isOnlineUserSpeak;
	}
	public void setIsOnlineUserSpeak(String isOnlineUserSpeak) {
		this.isOnlineUserSpeak = isOnlineUserSpeak;
	}

	public String getIsSend() {
		return this.isSend;
	}
	public void setIsSend(String isSend) {
		this.isSend = isSend;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getServiceChannel() {
		return this.serviceChannel;
	}
	public void setServiceChannel(String serviceChannel) {
		this.serviceChannel = serviceChannel;
	}

	public String getSessionUpgradeTime() {
		return this.sessionUpgradeTime;
	}
	public void setSessionUpgradeTime(String sessionUpgradeTime) {
		this.sessionUpgradeTime = sessionUpgradeTime;
	}

	public String getSessionUpgradeType() {
		return this.sessionUpgradeType;
	}
	public void setSessionUpgradeType(String sessionUpgradeType) {
		this.sessionUpgradeType = sessionUpgradeType;
	}

	public String getTransferBusinessName() {
		return this.transferBusinessName;
	}
	public void setTransferBusinessName(String transferBusinessName) {
		this.transferBusinessName = transferBusinessName;
	}

	public String getTransferCatNamLevel2() {
		return this.transferCatNamLevel2;
	}
	public void setTransferCatNamLevel2(String transferCatNamLevel2) {
		this.transferCatNamLevel2 = transferCatNamLevel2;
	}

	public String getTransferCatNamLevel3() {
		return this.transferCatNamLevel3;
	}
	public void setTransferCatNamLevel3(String transferCatNamLevel3) {
		this.transferCatNamLevel3 = transferCatNamLevel3;
	}

	public String getTransferServiveChannel() {
		return this.transferServiveChannel;
	}
	public void setTransferServiveChannel(String transferServiveChannel) {
		this.transferServiveChannel = transferServiveChannel;
	}

	public String getTransferSessionId() {
		return this.transferSessionId;
	}
	public void setTransferSessionId(String transferSessionId) {
		this.transferSessionId = transferSessionId;
	}

	public String getTransferUserOrderId() {
		return this.transferUserOrderId;
	}
	public void setTransferUserOrderId(String transferUserOrderId) {
		this.transferUserOrderId = transferUserOrderId;
	}

	public String getUnresolvedReason() {
		return this.unresolvedReason;
	}
	public void setUnresolvedReason(String unresolvedReason) {
		this.unresolvedReason = unresolvedReason;
	}

	public String getUpgradeTicketId() {
		return this.upgradeTicketId;
	}
	public void setUpgradeTicketId(String upgradeTicketId) {
		this.upgradeTicketId = upgradeTicketId;
	}

	public String getUserGuid() {
		return this.userGuid;
	}
	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}

	public String getUserOrderId() {
		return this.userOrderId;
	}
	public void setUserOrderId(String userOrderId) {
		this.userOrderId = userOrderId;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
