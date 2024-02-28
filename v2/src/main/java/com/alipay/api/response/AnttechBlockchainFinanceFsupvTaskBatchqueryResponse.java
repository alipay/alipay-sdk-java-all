package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupvFundTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.task.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 16:47:00
 */
public class AnttechBlockchainFinanceFsupvTaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6325814534536993435L;

	/** 
	 * 任务列表
	 */
	@ApiListField("task_list")
	@ApiField("supv_fund_task")
	private List<SupvFundTask> taskList;

	/** 
	 * 任务数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setTaskList(List<SupvFundTask> taskList) {
		this.taskList = taskList;
	}
	public List<SupvFundTask> getTaskList( ) {
		return this.taskList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
