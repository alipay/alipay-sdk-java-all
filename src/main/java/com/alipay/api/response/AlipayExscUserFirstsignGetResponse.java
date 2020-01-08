package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.exsc.user.firstsign.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayExscUserFirstsignGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4723732385656554825L;

	/** 
	 * 返回结果的业务类型。首次快捷绑卡业务类型 （first_sign）
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务处理结果
 true 无绑卡记录，本次是首次绑卡
 false 曾经绑过快捷卡，本次不是首次绑卡
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
