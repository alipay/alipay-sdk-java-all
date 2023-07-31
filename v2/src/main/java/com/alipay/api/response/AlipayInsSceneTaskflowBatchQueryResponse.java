package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsSceneTaskFlowDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.taskflow.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:16:51
 */
public class AlipayInsSceneTaskflowBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3443463312564558269L;

	/** 
	 * 任务流水列表
	 */
	@ApiListField("task_flow_list")
	@ApiField("ins_scene_task_flow_d_t_o")
	private List<InsSceneTaskFlowDTO> taskFlowList;

	public void setTaskFlowList(List<InsSceneTaskFlowDTO> taskFlowList) {
		this.taskFlowList = taskFlowList;
	}
	public List<InsSceneTaskFlowDTO> getTaskFlowList( ) {
		return this.taskFlowList;
	}

}
