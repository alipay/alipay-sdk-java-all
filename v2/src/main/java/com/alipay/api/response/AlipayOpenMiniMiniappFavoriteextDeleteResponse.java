package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favoriteext.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:26:59
 */
public class AlipayOpenMiniMiniappFavoriteextDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2883865945757324341L;

	/** 
	 * 成功：true
失败：false
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
