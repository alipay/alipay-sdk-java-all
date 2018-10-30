package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.upload response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-22 19:37:19
 */
public class ZhimaCreditEpEntityMonitorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4516452951658478143L;

	/** 
	 * 成功返回true,失败返回false
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 方案ID
	 */
	@ApiField("solution_id")
	private String solutionId;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

}
