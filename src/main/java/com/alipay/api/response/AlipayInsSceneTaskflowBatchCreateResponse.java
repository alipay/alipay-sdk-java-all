package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.taskflow.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-22 14:28:19
 */
public class AlipayInsSceneTaskflowBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3582979277759614878L;

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
