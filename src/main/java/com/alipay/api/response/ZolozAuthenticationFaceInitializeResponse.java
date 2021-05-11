package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.face.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-08 18:35:00
 */
public class ZolozAuthenticationFaceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3176972338327878634L;

	/** 
	 * 由客户端解析的非明文字符串数据
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 返回详细码
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * 返回详细信息
	 */
	@ApiField("ret_message_sub")
	private String retMessageSub;

	/** 
	 * zim唯一标识
	 */
	@ApiField("zim_id")
	private String zimId;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetCodeSub(String retCodeSub) {
		this.retCodeSub = retCodeSub;
	}
	public String getRetCodeSub( ) {
		return this.retCodeSub;
	}

	public void setRetMessageSub(String retMessageSub) {
		this.retMessageSub = retMessageSub;
	}
	public String getRetMessageSub( ) {
		return this.retMessageSub;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

}
