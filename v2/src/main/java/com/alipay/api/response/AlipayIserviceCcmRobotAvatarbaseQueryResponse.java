package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.avatarbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:26:47
 */
public class AlipayIserviceCcmRobotAvatarbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8855873773171661427L;

	/** 
	 * result:方法调用返回值响应 k-v map
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
