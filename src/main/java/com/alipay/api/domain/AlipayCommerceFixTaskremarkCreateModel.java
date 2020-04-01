package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单添加备注接口
 *
 * @author auto create
 * @since 1.0, 2020-03-27 19:46:31
 */
public class AlipayCommerceFixTaskremarkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8516323641616435499L;

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
