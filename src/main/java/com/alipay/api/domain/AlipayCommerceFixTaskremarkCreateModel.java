package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单添加备注接口
 *
 * @author auto create
 * @since 1.0, 2020-04-09 20:55:58
 */
public class AlipayCommerceFixTaskremarkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7159883959273797965L;

	/**
	 * 针对工单的补充备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 添加备注的工单id
	 */
	@ApiField("task_id")
	private Long taskId;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
