package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NCardAdvertiseTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncardadvertise.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-21 17:17:27
 */
public class AlipayOpenSpNcardadvertiseTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3135733295254162364L;

	/** 
	 * 线圈作业单列表
	 */
	@ApiListField("task_list")
	@ApiField("n_card_advertise_task")
	private List<NCardAdvertiseTask> taskList;

	public void setTaskList(List<NCardAdvertiseTask> taskList) {
		this.taskList = taskList;
	}
	public List<NCardAdvertiseTask> getTaskList( ) {
		return this.taskList;
	}

}
