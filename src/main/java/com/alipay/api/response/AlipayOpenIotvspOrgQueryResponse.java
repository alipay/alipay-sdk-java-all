package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityOrgQueryApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.org.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-27 15:02:56
 */
public class AlipayOpenIotvspOrgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1552242854759852121L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 机构信息
	 */
	@ApiField("data")
	private IotIdentityOrgQueryApiResponse data;

	/** 
	 * 错误描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 响应是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setData(IotIdentityOrgQueryApiResponse data) {
		this.data = data;
	}
	public IotIdentityOrgQueryApiResponse getData( ) {
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
