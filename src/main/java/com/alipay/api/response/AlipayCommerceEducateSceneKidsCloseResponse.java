package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.kids.close response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-26 17:15:31
 */
public class AlipayCommerceEducateSceneKidsCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6149518428131831384L;

	/** 
	 * 关闭业务是否成功
	 */
	@ApiField("close_success")
	private String closeSuccess;

	public void setCloseSuccess(String closeSuccess) {
		this.closeSuccess = closeSuccess;
	}
	public String getCloseSuccess( ) {
		return this.closeSuccess;
	}

}
