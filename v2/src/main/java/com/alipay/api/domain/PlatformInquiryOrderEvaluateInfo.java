package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单评价信息	
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:07
 */
public class PlatformInquiryOrderEvaluateInfo extends AlipayObject {

	private static final long serialVersionUID = 1343954754796121967L;

	/**
	 * 评价内容
	 */
	@ApiField("evaluate_content")
	private String evaluateContent;

	/**
	 * 评价标签
	 */
	@ApiField("evaluate_label")
	private String evaluateLabel;

	/**
	 * 评价分数；例如99、89
	 */
	@ApiField("evaluate_score")
	private String evaluateScore;

	/**
	 * 评价时间
	 */
	@ApiField("evaluate_time")
	private Date evaluateTime;

	/**
	 * 评价是否可透出
	 */
	@ApiField("open_status")
	private Boolean openStatus;

	public String getEvaluateContent() {
		return this.evaluateContent;
	}
	public void setEvaluateContent(String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}

	public String getEvaluateLabel() {
		return this.evaluateLabel;
	}
	public void setEvaluateLabel(String evaluateLabel) {
		this.evaluateLabel = evaluateLabel;
	}

	public String getEvaluateScore() {
		return this.evaluateScore;
	}
	public void setEvaluateScore(String evaluateScore) {
		this.evaluateScore = evaluateScore;
	}

	public Date getEvaluateTime() {
		return this.evaluateTime;
	}
	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public Boolean getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Boolean openStatus) {
		this.openStatus = openStatus;
	}

}
