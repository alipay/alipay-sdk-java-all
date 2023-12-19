package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.room.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:24:49
 */
public class AlipayOpenIotmbsRoomUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4245879862879423837L;

	/** 
	 * 成功true失败false
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
