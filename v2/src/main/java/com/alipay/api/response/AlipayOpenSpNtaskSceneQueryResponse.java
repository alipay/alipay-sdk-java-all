package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NTaskSceneDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ntask.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 10:27:33
 */
public class AlipayOpenSpNtaskSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5294627328865233524L;

	/** 
	 * 根据参数查询到的任务作业信息列表
	 */
	@ApiListField("task_list")
	@ApiField("n_task_scene_detail")
	private List<NTaskSceneDetail> taskList;

	public void setTaskList(List<NTaskSceneDetail> taskList) {
		this.taskList = taskList;
	}
	public List<NTaskSceneDetail> getTaskList( ) {
		return this.taskList;
	}

}
