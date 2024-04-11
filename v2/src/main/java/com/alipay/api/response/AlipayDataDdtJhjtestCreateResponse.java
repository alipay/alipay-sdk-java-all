package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.ddt.jhjtest.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-18 15:01:58
 */
public class AlipayDataDdtJhjtestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7735221855657894329L;

	/** 
	 * 1
	 */
	@ApiField("ot_a")
	private String otA;

	/** 
	 * aa1
	 */
	@ApiField("output_a")
	private String outputA;

	/** 
	 * B下主键
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
