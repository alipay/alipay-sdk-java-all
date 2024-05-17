package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deductagreement.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:20
 */
public class AlipayEbppInstserviceDeductagreementModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3776434147216982122L;

	/** 
	 * true代表受理成功
false代表受理失败
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 返回结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
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

}
