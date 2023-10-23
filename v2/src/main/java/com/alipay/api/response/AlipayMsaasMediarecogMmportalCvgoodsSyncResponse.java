package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmportal.cvgoods.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-09 20:21:46
 */
public class AlipayMsaasMediarecogMmportalCvgoodsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6256573283855911922L;

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
	 * 上新结果描述
	 */
	@ApiField("ret_msg")
	private String retMsg;

	/** 
	 * 上新成功与否判断
	 */
	@ApiField("success")
	private Boolean success;

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
