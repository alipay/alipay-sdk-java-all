package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.dsb.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:18:55
 */
public class AnttechAiCvDsbGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7558361641251656779L;

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
