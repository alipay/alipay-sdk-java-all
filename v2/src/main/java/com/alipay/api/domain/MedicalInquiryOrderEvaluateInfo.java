package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单评价信息
 *
 * @author auto create
 * @since 1.0, 2024-03-07 11:00:55
 */
public class MedicalInquiryOrderEvaluateInfo extends AlipayObject {

	private static final long serialVersionUID = 5824945935248625584L;

	/**
	 * 评价内容
	 */
	@ApiField("evaluate_content")
	private String evaluateContent;

	/**
	 * 标签内容，如“回答很及时”，“医术高明”等，用分隔符隔开，后续做差异化展示
文本内容，最多不超过500字
	 */
	@ApiField("evaluate_label")
	private String evaluateLabel;

	/**
	 * 规则标准：五星制，一位小数
	 */
	@ApiField("evaluate_score")
	private String evaluateScore;

	/**
	 * 格式：yyyy-mm-dd  hh:mm:ss
	 */
	@ApiField("evaluate_time")
	private String evaluateTime;

	/**
	 * 是/否
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

	public String getEvaluateTime() {
		return this.evaluateTime;
	}
	public void setEvaluateTime(String evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public Boolean getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Boolean openStatus) {
		this.openStatus = openStatus;
	}

}
