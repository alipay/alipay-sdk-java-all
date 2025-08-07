package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favoriteext.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 14:21:43
 */
public class AlipayOpenMiniMiniappFavoriteextAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8539234265725991484L;

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
