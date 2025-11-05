package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NPS卡片反馈信息保存
 *
 * @author auto create
 * @since 1.0, 2025-08-11 13:27:10
 */
public class AlipayCommerceMedicalNpsScoreSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1794234722298935727L;

	/**
	 * 业务信息
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 对话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 反馈信息
	 */
	@ApiField("feed_back_list")
	private String feedBackList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 评级
	 */
	@ApiField("rating_type")
	private String ratingType;

	/**
	 * 用户输入反馈信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 场景信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 评分 1 - 10
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 当前对话的seesionId
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFeedBackList() {
		return this.feedBackList;
	}
	public void setFeedBackList(String feedBackList) {
		this.feedBackList = feedBackList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getRatingType() {
		return this.ratingType;
	}
	public void setRatingType(String ratingType) {
		this.ratingType = ratingType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
