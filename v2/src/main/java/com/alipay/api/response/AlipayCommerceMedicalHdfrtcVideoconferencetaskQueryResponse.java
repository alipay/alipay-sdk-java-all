package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videoconferencetask.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 14:47:41
 */
public class AlipayCommerceMedicalHdfrtcVideoconferencetaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2712276153993546773L;

	/** 
	 * 来源ID
	 */
	@ApiField("source_id")
	private Long sourceId;

	/** 
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/** 
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	public Long getSourceId( ) {
		return this.sourceId;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getSourceType( ) {
		return this.sourceType;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
