package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.roomstate.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-29 10:10:33
 */
public class AlipayOpenIotmbsRoomstateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5178591986266281935L;

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
