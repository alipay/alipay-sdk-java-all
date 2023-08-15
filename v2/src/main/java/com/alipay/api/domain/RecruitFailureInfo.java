package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建活动报名失败信息
 *
 * @author auto create
 * @since 1.0, 2023-04-25 18:08:32
 */
public class RecruitFailureInfo extends AlipayObject {

	private static final long serialVersionUID = 5299161339791568597L;

	/**
	 * 创建活动报名失败原因。调用创建活动报名接口经业务校验不通过的提示信息。
	 */
	@ApiField("enroll_failure_reason")
	private String enrollFailureReason;

	public String getEnrollFailureReason() {
		return this.enrollFailureReason;
	}
	public void setEnrollFailureReason(String enrollFailureReason) {
		this.enrollFailureReason = enrollFailureReason;
	}

}
