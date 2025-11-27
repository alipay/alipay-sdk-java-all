package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问卷调查结果同步
 *
 * @author auto create
 * @since 1.0, 2025-01-17 11:37:15
 */
public class AlipayUserSportshealthQuestionnaireCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 7382783394938677955L;

	/**
	 * 业务唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 问卷调查结果
	 */
	@ApiField("survey_result")
	private String surveyResult;

	/**
	 * 调查类型
	 */
	@ApiField("survey_type")
	private String surveyType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSurveyResult() {
		return this.surveyResult;
	}
	public void setSurveyResult(String surveyResult) {
		this.surveyResult = surveyResult;
	}

	public String getSurveyType() {
		return this.surveyType;
	}
	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
