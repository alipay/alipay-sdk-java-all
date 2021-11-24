package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垃圾分类反馈回流
 *
 * @author auto create
 * @since 1.0, 2019-07-06 17:33:58
 */
public class AlipayIserviceCognitiveClassificationFeedbackSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4859779777673132479L;

	/**
	 * 反馈结果：同意，修正，忽略
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 业务编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 图片url，或者文本
	 */
	@ApiField("cognition_content")
	private String cognitionContent;

	/**
	 * 数据类型
	 */
	@ApiField("cognition_type")
	private String cognitionType;

	/**
	 * 用户反馈的垃圾类别
	 */
	@ApiField("feedback_category")
	private String feedbackCategory;

	/**
	 * 用户反馈的正确的垃圾名称
	 */
	@ApiField("feedback_rubbish")
	private String feedbackRubbish;

	/**
	 * 预测的垃圾类别
	 */
	@ApiField("predict_category")
	private String predictCategory;

	/**
	 * 垃圾名称
	 */
	@ApiField("predict_rubbish")
	private String predictRubbish;

	/**
	 * traceid
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCognitionContent() {
		return this.cognitionContent;
	}
	public void setCognitionContent(String cognitionContent) {
		this.cognitionContent = cognitionContent;
	}

	public String getCognitionType() {
		return this.cognitionType;
	}
	public void setCognitionType(String cognitionType) {
		this.cognitionType = cognitionType;
	}

	public String getFeedbackCategory() {
		return this.feedbackCategory;
	}
	public void setFeedbackCategory(String feedbackCategory) {
		this.feedbackCategory = feedbackCategory;
	}

	public String getFeedbackRubbish() {
		return this.feedbackRubbish;
	}
	public void setFeedbackRubbish(String feedbackRubbish) {
		this.feedbackRubbish = feedbackRubbish;
	}

	public String getPredictCategory() {
		return this.predictCategory;
	}
	public void setPredictCategory(String predictCategory) {
		this.predictCategory = predictCategory;
	}

	public String getPredictRubbish() {
		return this.predictRubbish;
	}
	public void setPredictRubbish(String predictRubbish) {
		this.predictRubbish = predictRubbish;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
