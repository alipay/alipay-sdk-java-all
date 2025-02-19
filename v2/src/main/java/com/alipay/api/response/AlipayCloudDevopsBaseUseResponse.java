package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.devops.base.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 17:31:45
 */
public class AlipayCloudDevopsBaseUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1671655824599694746L;

	/** 
	 * 业务描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 通过
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 业务状态
	 */
	@ApiField("biz_status")
	private Boolean bizStatus;

	/** 
	 * 业务traceId
	 */
	@ApiField("biz_trace")
	private String bizTrace;

	/** 
	 * 闪退列表
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setBizStatus(Boolean bizStatus) {
		this.bizStatus = bizStatus;
	}
	public Boolean getBizStatus( ) {
		return this.bizStatus;
	}

	public void setBizTrace(String bizTrace) {
		this.bizTrace = bizTrace;
	}
	public String getBizTrace( ) {
		return this.bizTrace;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
