package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市政单位提交反馈
 *
 * @author auto create
 * @since 1.0, 2023-12-14 17:53:48
 */
public class AlipayMerchantComplainGovernmentSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6834196575457597363L;

	/**
	 * 支付宝侧投诉单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/**
	 * 反馈类目ID
	 */
	@ApiField("feedback_code")
	private String feedbackCode;

	/**
	 * 反馈内容，字数不超过200个字
	 */
	@ApiField("feedback_content")
	private String feedbackContent;

	/**
	 * 处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
	 */
	@ApiField("feedback_images")
	private String feedbackImages;

	/**
	 * 处理投诉人，字数不超过6个字
	 */
	@ApiField("operator")
	private String operator;

	public String getComplainEventId() {
		return this.complainEventId;
	}
	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}

	public String getFeedbackCode() {
		return this.feedbackCode;
	}
	public void setFeedbackCode(String feedbackCode) {
		this.feedbackCode = feedbackCode;
	}

	public String getFeedbackContent() {
		return this.feedbackContent;
	}
	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}

	public String getFeedbackImages() {
		return this.feedbackImages;
	}
	public void setFeedbackImages(String feedbackImages) {
		this.feedbackImages = feedbackImages;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
