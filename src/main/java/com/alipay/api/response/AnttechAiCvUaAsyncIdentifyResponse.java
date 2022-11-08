package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.ua.async.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-04 15:16:49
 */
public class AnttechAiCvUaAsyncIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3164473251897999112L;

	/** 
	 * 调用机器域名
	 */
	@ApiField("host")
	private String host;

	/** 
	 * 返回码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果msg
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 调用是否成功
	 */
	@ApiField("result_success")
	private String resultSuccess;

	/** 
	 * 模型服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 用于后续查询结果使用
	 */
	@ApiField("task_id")
	private String taskId;

	public void setHost(String host) {
		this.host = host;
	}
	public String getHost( ) {
		return this.host;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setResultSuccess(String resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public String getResultSuccess( ) {
		return this.resultSuccess;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
