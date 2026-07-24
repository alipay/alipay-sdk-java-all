package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动报名
 *
 * @author auto create
 * @since 1.0, 2026-06-30 10:37:59
 */
public class AlipayCommerceOperationPromoActivitySignupModel extends AlipayObject {

	private static final long serialVersionUID = 7865456425381685785L;

	/**
	 * 活动唯一编码，固定值
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 指定期次报名场景必传
	 */
	@ApiField("round_id")
	private String roundId;

	/**
	 * 场景编码，固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 报名信息，需传入JSON转义后的字符串；点餐激励场景必填！
	 */
	@ApiField("sign_up_info")
	private String signUpInfo;

	/**
	 * 客户报名使用的支付宝账号
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 客户报名使用的支付宝账号类型
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getRoundId() {
		return this.roundId;
	}
	public void setRoundId(String roundId) {
		this.roundId = roundId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSignUpInfo() {
		return this.signUpInfo;
	}
	public void setSignUpInfo(String signUpInfo) {
		this.signUpInfo = signUpInfo;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
