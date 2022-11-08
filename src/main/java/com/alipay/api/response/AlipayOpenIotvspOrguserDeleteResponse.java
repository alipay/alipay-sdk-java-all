package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityOrgUserRemoveApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.orguser.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-27 20:45:40
 */
public class AlipayOpenIotvspOrguserDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3743362596488254223L;

	/** 
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 入库事件id
	 */
	@ApiField("data")
	private IotIdentityOrgUserRemoveApiResponse data;

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

	public void setData(IotIdentityOrgUserRemoveApiResponse data) {
		this.data = data;
	}
	public IotIdentityOrgUserRemoveApiResponse getData( ) {
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
