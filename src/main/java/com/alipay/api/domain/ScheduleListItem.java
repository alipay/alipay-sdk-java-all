package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度任务列表详细
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:08:05
 */
public class ScheduleListItem extends AlipayObject {

	private static final long serialVersionUID = 6645926897459228582L;

	/**
	 * 任务id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 任务状态枚举。 0：准备， 1：运行中  2：已完成  3： 失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务类型。枚举，参考任务类型
	 */
	@ApiField("type")
	private String type;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
