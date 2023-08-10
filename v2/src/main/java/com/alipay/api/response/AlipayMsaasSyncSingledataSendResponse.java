package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.sync.singledata.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:11:56
 */
public class AlipayMsaasSyncSingledataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5618339453482123979L;

	/** 
	 * SYNC内部业务数据ID
	 */
	@ApiField("oplog_id")
	private String oplogId;

	/** 
	 * 返回结果代码
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * 返回结果含义
	 */
	@ApiField("return_reason")
	private String returnReason;

	/** 
	 * 接口调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setOplogId(String oplogId) {
		this.oplogId = oplogId;
	}
	public String getOplogId( ) {
		return this.oplogId;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}
	public String getReturnReason( ) {
		return this.returnReason;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
