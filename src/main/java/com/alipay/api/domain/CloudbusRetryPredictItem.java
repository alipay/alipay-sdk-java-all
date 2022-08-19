package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流重新预测接口返回结果
 *
 * @author auto create
 * @since 1.0, 2019-10-29 15:14:46
 */
public class CloudbusRetryPredictItem extends AlipayObject {

	private static final long serialVersionUID = 2867836776511879527L;

	/**
	 * 处理过程状态描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 重试任务计划
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
