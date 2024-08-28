package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.sign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppJfSignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5616242684923297423L;

	/** 
	 * 咨询结果代码,允许签约时为SUCCESS, 其他情况根据不同的机构返回咨询异常设置
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 签约结果文案, 当允许签约时为空
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 是否允许签约
	 */
	@ApiField("sign_allowed")
	private Boolean signAllowed;

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

	public void setSignAllowed(Boolean signAllowed) {
		this.signAllowed = signAllowed;
	}
	public Boolean getSignAllowed( ) {
		return this.signAllowed;
	}

}
