package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskDetailInfo;
import com.alipay.api.domain.TaskVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.task.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 11:38:20
 */
public class AlipayCommerceOperationTaskDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6517936265175957541L;

	/** 
	 * 任务详情信息
	 */
	@ApiField("task_detail_info")
	private TaskDetailInfo taskDetailInfo;

	/** 
	 * 任务详情信息
	 */
	@ApiListField("task_voucher_list")
	@ApiField("task_voucher_info")
	private List<TaskVoucherInfo> taskVoucherList;

	public void setTaskDetailInfo(TaskDetailInfo taskDetailInfo) {
		this.taskDetailInfo = taskDetailInfo;
	}
	public TaskDetailInfo getTaskDetailInfo( ) {
		return this.taskDetailInfo;
	}

	public void setTaskVoucherList(List<TaskVoucherInfo> taskVoucherList) {
		this.taskVoucherList = taskVoucherList;
	}
	public List<TaskVoucherInfo> getTaskVoucherList( ) {
		return this.taskVoucherList;
	}

}
