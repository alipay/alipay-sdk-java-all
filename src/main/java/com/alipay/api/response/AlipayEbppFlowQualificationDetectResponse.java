package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.flow.qualification.detect response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppFlowQualificationDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 4265356158118734598L;

	/** 
	 * 子业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 子业务描述
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 用户绑定的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 返回用户的校验结果
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 校验资格描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc( ) {
		return this.bizDesc;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
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
