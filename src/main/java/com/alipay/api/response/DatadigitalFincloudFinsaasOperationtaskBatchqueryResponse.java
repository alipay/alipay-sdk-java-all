package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperationTaskDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.operationtask.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-26 10:21:47
 */
public class DatadigitalFincloudFinsaasOperationtaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1898126597453398549L;

	/** 
	 * operation_task + 运营任务模糊查询 + 数据库。
	 */
	@ApiListField("operation_tasks")
	@ApiField("operation_task_d_t_o")
	private List<OperationTaskDTO> operationTasks;

	/** 
	 * total + 运营任务模糊查询 + 数据库
	 */
	@ApiField("total")
	private Long total;

	public void setOperationTasks(List<OperationTaskDTO> operationTasks) {
		this.operationTasks = operationTasks;
	}
	public List<OperationTaskDTO> getOperationTasks( ) {
		return this.operationTasks;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
