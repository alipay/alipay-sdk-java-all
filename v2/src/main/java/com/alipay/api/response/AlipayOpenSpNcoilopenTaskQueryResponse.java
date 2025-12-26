package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:07:41
 */
public class AlipayOpenSpNcoilopenTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7614288623237846678L;

	/** 
	 * 修改文件url
	 */
	@ApiField("fail_file_url")
	private String failFileUrl;

	/** 
	 * 物料提交失败数量
	 */
	@ApiField("fail_number")
	private Long failNumber;

	/** 
	 * 任务处理进度
	 */
	@ApiField("task_progress")
	private String taskProgress;

	public void setFailFileUrl(String failFileUrl) {
		this.failFileUrl = failFileUrl;
	}
	public String getFailFileUrl( ) {
		return this.failFileUrl;
	}

	public void setFailNumber(Long failNumber) {
		this.failNumber = failNumber;
	}
	public Long getFailNumber( ) {
		return this.failNumber;
	}

	public void setTaskProgress(String taskProgress) {
		this.taskProgress = taskProgress;
	}
	public String getTaskProgress( ) {
		return this.taskProgress;
	}

}
