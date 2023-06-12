package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.room.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:00:16
 */
public class AlipayOpenIotmbsRoomBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6192635524846493432L;

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
