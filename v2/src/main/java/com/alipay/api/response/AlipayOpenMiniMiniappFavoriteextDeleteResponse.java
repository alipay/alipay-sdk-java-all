package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favoriteext.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:01:49
 */
public class AlipayOpenMiniMiniappFavoriteextDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5239749592948216295L;

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
