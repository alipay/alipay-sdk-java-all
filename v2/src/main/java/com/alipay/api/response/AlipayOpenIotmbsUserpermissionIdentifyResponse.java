package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.userpermission.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:26:57
 */
public class AlipayOpenIotmbsUserpermissionIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8513135636115564755L;

	/** 
	 * 返回鉴权结果
	 */
	@ApiField("permit")
	private String permit;

	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getPermit( ) {
		return this.permit;
	}

}
