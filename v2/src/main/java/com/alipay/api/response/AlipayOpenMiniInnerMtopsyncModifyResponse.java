package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.mtopsync.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:17:32
 */
public class AlipayOpenMiniInnerMtopsyncModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7435339925854862615L;

	/** 
	 * 业务调用成功code
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 业务调用成功msg
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 调用结果
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * 调用结果的文字描述
	 */
	@ApiField("sub_msg")
	private String subMsg;

	/** 
	 * Business Failed
	 */
	@ApiField("type")
	private String type;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}
	public String getSubMsg( ) {
		return this.subMsg;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
