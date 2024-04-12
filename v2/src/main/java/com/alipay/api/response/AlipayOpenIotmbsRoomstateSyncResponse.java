package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.roomstate.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:56:27
 */
public class AlipayOpenIotmbsRoomstateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6276942819982692113L;

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
