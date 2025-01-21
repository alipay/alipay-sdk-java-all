package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.shop.task.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 15:19:34
 */
public class AnttechMorseMarketingShopTaskUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7434856716269243959L;

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
