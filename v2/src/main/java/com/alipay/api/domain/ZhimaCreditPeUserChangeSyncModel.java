package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用城市同步用户信息
 *
 * @author auto create
 * @since 1.0, 2026-06-10 10:20:18
 */
public class ZhimaCreditPeUserChangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5354653721296117549L;

	/**
	 * 开通/授权协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/**
	 * 白鹭分评估时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("evaluate_time")
	private Date evaluateTime;

	/**
	 * 是否新开通用户
Y：新开通
N：非新开通
	 */
	@ApiField("is_new_open")
	private String isNewOpen;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求唯一单号，每次请求要保持唯一不重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 白鹭分等级（极好/优秀/良好/中等/待提升）
	 */
	@ApiField("score_level")
	private String scoreLevel;

	/**
	 * 信用服务service_id； 芝麻侧通过商户PID生成的一个信用服务的id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 例如厦门白鹭分：710分
	 */
	@ApiField("user_score")
	private String userScore;

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}

	public Date getEvaluateTime() {
		return this.evaluateTime;
	}
	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public String getIsNewOpen() {
		return this.isNewOpen;
	}
	public void setIsNewOpen(String isNewOpen) {
		this.isNewOpen = isNewOpen;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getScoreLevel() {
		return this.scoreLevel;
	}
	public void setScoreLevel(String scoreLevel) {
		this.scoreLevel = scoreLevel;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserScore() {
		return this.userScore;
	}
	public void setUserScore(String userScore) {
		this.userScore = userScore;
	}

}
