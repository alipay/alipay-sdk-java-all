package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favoriteext.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-14 10:17:02
 */
public class AlipayOpenMiniMiniappFavoriteextAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8716733336754859131L;

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
