package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询充电智能选址任务
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:13:03
 */
public class AlipayCommerceTransportChargerSiteselectionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7237822782198759647L;

	/**
	 * 计算任务编号
	 */
	@ApiListField("task_ids")
	@ApiField("string")
	private List<String> taskIds;

	public List<String> getTaskIds() {
		return this.taskIds;
	}
	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}

}
