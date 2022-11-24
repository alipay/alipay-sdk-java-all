package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.room.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-07 10:53:17
 */
public class AlipayOpenIotmbsRoomUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 7136226973484755432L;

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
