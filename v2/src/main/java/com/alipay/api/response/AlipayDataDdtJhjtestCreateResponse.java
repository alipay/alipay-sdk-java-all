package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.ddt.jhjtest.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-03 20:06:16
 */
public class AlipayDataDdtJhjtestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4273624747883585384L;

	/** 
	 * 1
	 */
	@ApiField("ot_a")
	private String otA;

	/** 
	 * 文档测试
	 */
	@ApiField("output_a")
	private String outputA;

	/** 
	 * 文档测试
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * B下主键
	 */
	@ApiField("user_id_openid")
	private String userIdOpenid;

	public void setOtA(String otA) {
		this.otA = otA;
	}
	public String getOtA( ) {
		return this.otA;
	}

	public void setOutputA(String outputA) {
		this.outputA = outputA;
	}
	public String getOutputA( ) {
		return this.outputA;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserIdOpenid(String userIdOpenid) {
		this.userIdOpenid = userIdOpenid;
	}
	public String getUserIdOpenid( ) {
		return this.userIdOpenid;
	}

}
