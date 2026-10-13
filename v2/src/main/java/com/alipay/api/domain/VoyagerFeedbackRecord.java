package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:17
 */
public class VoyagerFeedbackRecord extends AlipayObject {

	private static final long serialVersionUID = 5549237538612513625L;

	/**
	 * 反馈信息
	 */
	@ApiField("feedback_ext_info")
	private String feedbackExtInfo;

	/**
	 * 反馈类型，show:曝光, click:点击
	 */
	@ApiField("type")
	private String type;

	public String getFeedbackExtInfo() {
		return this.feedbackExtInfo;
	}
	public void setFeedbackExtInfo(String feedbackExtInfo) {
		this.feedbackExtInfo = feedbackExtInfo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
