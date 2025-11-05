package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.closeloop.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:13:16
 */
public class ZhimaMerchantCloseloopDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4684613247556952422L;

	/** 
	 * 公用回传参数（非必填），这个字段由商户传入，系统透传给商户。
	 */
	@ApiField("biz_ext_params")
	private String bizExtParams;

	/** 
	 * 每次上传都会生成一个任务号
	 */
	@ApiField("task_id")
	private String taskId;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams( ) {
		return this.bizExtParams;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
