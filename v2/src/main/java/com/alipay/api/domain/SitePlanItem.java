package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务结果
 *
 * @author auto create
 * @since 1.0, 2020-04-17 11:30:53
 */
public class SitePlanItem extends AlipayObject {

	private static final long serialVersionUID = 6163455618637892455L;

	/**
	 * 任务id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 任务状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 任务类型
	 */
	@ApiField("type")
	private Long type;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
