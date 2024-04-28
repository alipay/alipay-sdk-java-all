package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构openApi,正向结果回收，丁铃测试
 *
 * @author auto create
 * @since 1.0, 2024-01-26 10:12:39
 */
public class AlipayIserviceItaskOutorderForwardFinishModel extends AlipayObject {

	private static final long serialVersionUID = 1338382963427899498L;

	/**
	 * 机构正向工单结果回收对象
	 */
	@ApiField("forward_feedback_order_request")
	private ForwardFeedbackOrderRequest forwardFeedbackOrderRequest;

	public ForwardFeedbackOrderRequest getForwardFeedbackOrderRequest() {
		return this.forwardFeedbackOrderRequest;
	}
	public void setForwardFeedbackOrderRequest(ForwardFeedbackOrderRequest forwardFeedbackOrderRequest) {
		this.forwardFeedbackOrderRequest = forwardFeedbackOrderRequest;
	}

}
