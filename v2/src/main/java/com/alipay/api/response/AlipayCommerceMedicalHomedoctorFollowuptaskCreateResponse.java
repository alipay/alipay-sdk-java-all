package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskCreateResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.followuptask.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-24 17:58:45
 */
public class AlipayCommerceMedicalHomedoctorFollowuptaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1678265525993983759L;

	/** 
	 * null
	 */
	@ApiListField("task_list")
	@ApiField("task_create_response")
	private List<TaskCreateResponse> taskList;

	public void setTaskList(List<TaskCreateResponse> taskList) {
		this.taskList = taskList;
	}
	public List<TaskCreateResponse> getTaskList( ) {
		return this.taskList;
	}

}
