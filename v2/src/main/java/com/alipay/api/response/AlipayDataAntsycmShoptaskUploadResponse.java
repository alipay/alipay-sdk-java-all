package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.antsycm.shoptask.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 16:12:54
 */
public class AlipayDataAntsycmShoptaskUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4595792568138584594L;

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
