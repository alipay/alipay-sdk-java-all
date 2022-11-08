package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityFaceOutEventApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.orguserfaceout.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-27 14:36:42
 */
public class AlipayOpenIotvspOrguserfaceoutQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8119177486567781613L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 事件响应
	 */
	@ApiField("data")
	private IotIdentityFaceOutEventApiResponse data;

	/** 
	 * 错误描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setData(IotIdentityFaceOutEventApiResponse data) {
		this.data = data;
	}
	public IotIdentityFaceOutEventApiResponse getData( ) {
		return this.data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
