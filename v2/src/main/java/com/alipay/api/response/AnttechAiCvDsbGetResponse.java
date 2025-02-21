package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.dsb.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:18
 */
public class AnttechAiCvDsbGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6715681942312641123L;

	/** 
	 * 定损结果的下载链接，15分钟内有效
	 */
	@ApiField("result_url")
	private String resultUrl;

	/** 
	 * 总共3个状态：RUNNING，SUCC，FAILED
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 请求参数内传入的task_id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setResultUrl(String resultUrl) {
		this.resultUrl = resultUrl;
	}
	public String getResultUrl( ) {
		return this.resultUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
