package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-29 10:47:50
 */
public class TripartiteVoice extends AlipayObject {

	private static final long serialVersionUID = 8261396977177351376L;

	/**
	 * anteye一级意图
	 */
	@ApiField("anteye_intention_l_1")
	private String anteyeIntentionL1;

	/**
	 * anteye二级意图
	 */
	@ApiField("anteye_intention_l_2")
	private String anteyeIntentionL2;

	/**
	 * anteye三级意图
	 */
	@ApiField("anteye_intention_l_3")
	private String anteyeIntentionL3;

	/**
	 * 支付宝客户端版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 业务日期，格式：yyyy-MM-dd
	 */
	@ApiField("bus_date")
	private String busDate;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 客诉内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容摘要
	 */
	@ApiField("content_abstract")
	private String contentAbstract;

	/**
	 * 创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 机构处理完成时间，格式yyyy-MM-dd
	 */
	@ApiField("handle_time")
	private String handleTime;

	/**
	 * 线上模式(WiFi/5G/4G等)
	 */
	@ApiField("online_mode")
	private String onlineMode;

	/**
	 * 手机系统
	 */
	@ApiField("phone_system")
	private String phoneSystem;

	/**
	 * 问题类型
	 */
	@ApiField("problem_type")
	private String problemType;

	/**
	 * 处理状态
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 处理说明（机构回推后填充）
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 客诉标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 原声渠道(如 EXP_VOICE_FEEDBACK)
	 */
	@ApiField("voice_channel")
	private String voiceChannel;

	/**
	 * 客权全局客诉ID
	 */
	@ApiField("voice_id")
	private String voiceId;

	public String getAnteyeIntentionL1() {
		return this.anteyeIntentionL1;
	}
	public void setAnteyeIntentionL1(String anteyeIntentionL1) {
		this.anteyeIntentionL1 = anteyeIntentionL1;
	}

	public String getAnteyeIntentionL2() {
		return this.anteyeIntentionL2;
	}
	public void setAnteyeIntentionL2(String anteyeIntentionL2) {
		this.anteyeIntentionL2 = anteyeIntentionL2;
	}

	public String getAnteyeIntentionL3() {
		return this.anteyeIntentionL3;
	}
	public void setAnteyeIntentionL3(String anteyeIntentionL3) {
		this.anteyeIntentionL3 = anteyeIntentionL3;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBusDate() {
		return this.busDate;
	}
	public void setBusDate(String busDate) {
		this.busDate = busDate;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentAbstract() {
		return this.contentAbstract;
	}
	public void setContentAbstract(String contentAbstract) {
		this.contentAbstract = contentAbstract;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getHandleTime() {
		return this.handleTime;
	}
	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}

	public String getOnlineMode() {
		return this.onlineMode;
	}
	public void setOnlineMode(String onlineMode) {
		this.onlineMode = onlineMode;
	}

	public String getPhoneSystem() {
		return this.phoneSystem;
	}
	public void setPhoneSystem(String phoneSystem) {
		this.phoneSystem = phoneSystem;
	}

	public String getProblemType() {
		return this.problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoiceChannel() {
		return this.voiceChannel;
	}
	public void setVoiceChannel(String voiceChannel) {
		this.voiceChannel = voiceChannel;
	}

	public String getVoiceId() {
		return this.voiceId;
	}
	public void setVoiceId(String voiceId) {
		this.voiceId = voiceId;
	}

}
