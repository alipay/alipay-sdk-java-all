package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.point.task.complete response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 10:42:41
 */
public class AlipayCommerceMedicalPointTaskCompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7699628281617888845L;

	/** 
	 * 处理码
	 */
	@ApiField("res_code")
	private String resCode;

	/** 
	 * 业务处理标识
	 */
	@ApiField("res_flag")
	private Boolean resFlag;

	/** 
	 * 业务处理描述
	 */
	@ApiField("res_msg")
	private String resMsg;

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResCode( ) {
		return this.resCode;
	}

	public void setResFlag(Boolean resFlag) {
		this.resFlag = resFlag;
	}
	public Boolean getResFlag( ) {
		return this.resFlag;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getResMsg( ) {
		return this.resMsg;
	}

}
