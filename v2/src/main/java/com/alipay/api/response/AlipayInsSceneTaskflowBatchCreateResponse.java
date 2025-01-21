package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.taskflow.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-20 11:18:50
 */
public class AlipayInsSceneTaskflowBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7229258478815943458L;

	/** 
	 * 任务流水列表
	 */
	@ApiListField("task_flow_id_list")
	@ApiField("string")
	private List<String> taskFlowIdList;

	public void setTaskFlowIdList(List<String> taskFlowIdList) {
		this.taskFlowIdList = taskFlowIdList;
	}
	public List<String> getTaskFlowIdList( ) {
		return this.taskFlowIdList;
	}

}
