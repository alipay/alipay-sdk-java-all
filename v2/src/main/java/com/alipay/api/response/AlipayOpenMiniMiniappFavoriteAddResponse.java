package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favorite.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 14:21:15
 */
public class AlipayOpenMiniMiniappFavoriteAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4464769254284369926L;

	/** 
	 * 成功：true
失败：false
	 */
	@ApiField("add_result")
	private Boolean addResult;

	public void setAddResult(Boolean addResult) {
		this.addResult = addResult;
	}
	public Boolean getAddResult( ) {
		return this.addResult;
	}

}
