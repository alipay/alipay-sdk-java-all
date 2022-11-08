package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityOrgUserSaveApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.orguser.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-31 10:06:42
 */
public class AlipayOpenIotvspOrguserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8283486865886947352L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 机构人员添加出参
	 */
	@ApiField("data")
	private IotIdentityOrgUserSaveApiResponse data;

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

	public void setData(IotIdentityOrgUserSaveApiResponse data) {
		this.data = data;
	}
	public IotIdentityOrgUserSaveApiResponse getData( ) {
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
