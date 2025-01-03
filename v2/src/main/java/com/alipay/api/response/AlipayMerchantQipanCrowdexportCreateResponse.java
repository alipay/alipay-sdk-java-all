package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdexport.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 19:53:31
 */
public class AlipayMerchantQipanCrowdexportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5235453896398179872L;

	/** 
	 * 导出任务流水号
	 */
	@ApiField("task_no")
	private String taskNo;

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	public String getTaskNo( ) {
		return this.taskNo;
	}

}
