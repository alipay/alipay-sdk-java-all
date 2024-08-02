package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.room.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:14:01
 */
public class AlipayOpenIotmbsRoomBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6418996454481894597L;

	/** 
	 * 成功为true，失败为false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
