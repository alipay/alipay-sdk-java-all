package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.csfu.servicehall.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-16 18:02:40
 */
public class AlipayIserviceCsfuServicehallSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1818951949136278285L;

	/** 
	 * 对话动作 VobotReActionEnum
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 是否允许打断
	 */
	@ApiField("interruptible")
	private Boolean interruptible;

	/** 
	 * 机器人说的话
	 */
	@ApiField("output_content")
	private String outputContent;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 转人工目标码
	 */
	@ApiField("transfer_target_code")
	private String transferTargetCode;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setInterruptible(Boolean interruptible) {
		this.interruptible = interruptible;
	}
	public Boolean getInterruptible( ) {
		return this.interruptible;
	}

	public void setOutputContent(String outputContent) {
		this.outputContent = outputContent;
	}
	public String getOutputContent( ) {
		return this.outputContent;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTransferTargetCode(String transferTargetCode) {
		this.transferTargetCode = transferTargetCode;
	}
	public String getTransferTargetCode( ) {
		return this.transferTargetCode;
	}

}
