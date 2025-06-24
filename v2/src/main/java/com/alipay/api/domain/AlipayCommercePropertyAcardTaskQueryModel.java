package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制卡任务查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-23 17:22:30
 */
public class AlipayCommercePropertyAcardTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7851936652857467622L;

	/**
	 * 外部客户保证唯一性，平台以此字段作幂等性处理。out_biz_id和task_id不能同时为空。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 制卡请求受理后的制卡任务唯一ID，与outBizId一一对应。out_biz_id和task_id不能同时为空。
	 */
	@ApiField("task_id")
	private String taskId;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
