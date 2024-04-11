package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.kids.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:33:43
 */
public class AlipayCommerceEducateSceneKidsCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7626236358622291297L;

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
