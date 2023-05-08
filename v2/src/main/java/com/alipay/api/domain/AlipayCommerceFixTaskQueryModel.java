package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态协同单查询接口
 *
 * @author auto create
 * @since 1.0, 2020-04-09 20:55:15
 */
public class AlipayCommerceFixTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5573373354486351825L;

	/**
	 * 工单唯一id。
获取途径：创建工单的返回结果id，或者通知消息中的工单id进行查询。
	 */
	@ApiField("task_id")
	private Long taskId;

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
