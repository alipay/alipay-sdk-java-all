package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.antsycm.shoptask.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-12 17:42:00
 */
public class AlipayDataAntsycmShoptaskUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8386219522761377462L;

	/** 
	 * 存在空情况未成功创建任务，否则返回任务id，用于查询门店数据
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
