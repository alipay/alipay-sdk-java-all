package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流预测结果
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:27:56
 */
public class CloudbusSubmitPredictItem extends AlipayObject {

	private static final long serialVersionUID = 1758916172692859125L;

	/**
	 * 处理过程状态描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 任务计划
	 */
	@ApiField("plan_id")
	private String planId;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
