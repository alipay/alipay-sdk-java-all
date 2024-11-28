package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构正向工单结果回收对象
 *
 * @author auto create
 * @since 1.0, 2024-01-26 10:12:39
 */
public class ForwardFeedbackOrderRequest extends AlipayObject {

	private static final long serialVersionUID = 3844928818675222613L;

	/**
	 * 反馈说明
	 */
	@ApiField("feedback_desc")
	private String feedbackDesc;

	/**
	 * 反馈类型
	 */
	@ApiField("feedback_type")
	private String feedbackType;

	/**
	 * 机构工单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 客权工单ID
	 */
	@ApiField("self_order_id")
	private String selfOrderId;

	public String getFeedbackDesc() {
		return this.feedbackDesc;
	}
	public void setFeedbackDesc(String feedbackDesc) {
		this.feedbackDesc = feedbackDesc;
	}

	public String getFeedbackType() {
		return this.feedbackType;
	}
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getSelfOrderId() {
		return this.selfOrderId;
	}
	public void setSelfOrderId(String selfOrderId) {
		this.selfOrderId = selfOrderId;
	}

}
