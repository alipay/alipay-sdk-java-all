package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmportal.cvgooodsonlinelist.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:44
 */
public class AlipayMsaasMediarecogMmportalCvgooodsonlinelistSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6714663541113318298L;

	/** 
	 * 结果字段，可扩展
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 响应返回码
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * 返回接口处理结果, 包含异常消息
	 */
	@ApiField("ret_msg")
	private String retMsg;

	/** 
	 * 执行结果是否成功
	 */
	@ApiField("ret_success")
	private Boolean retSuccess;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public String getRetMsg( ) {
		return this.retMsg;
	}

	public void setRetSuccess(Boolean retSuccess) {
		this.retSuccess = retSuccess;
	}
	public Boolean getRetSuccess( ) {
		return this.retSuccess;
	}

}
