package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.taskflow.batch.finish response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-27 22:21:15
 */
public class AlipayInsSceneTaskflowBatchFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8185967911498874934L;

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
