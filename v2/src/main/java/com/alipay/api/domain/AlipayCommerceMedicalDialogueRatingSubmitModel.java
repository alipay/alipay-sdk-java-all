package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话评分接口
 *
 * @author auto create
 * @since 1.0, 2024-12-19 20:41:17
 */
public class AlipayCommerceMedicalDialogueRatingSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7588347256544461335L;

	/**
	 * 功能编码，服务端会通过卡片传过来
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用户反馈
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
	 * 用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；若是open_id时，设置为ALIPAY_OPENID
	 */
	@ApiField("outer_user_type")
	private String outerUserType;

	/**
	 * 用户评论
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 评分
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 当前sessionId
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getOuterUserType() {
		return this.outerUserType;
	}
	public void setOuterUserType(String outerUserType) {
		this.outerUserType = outerUserType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
