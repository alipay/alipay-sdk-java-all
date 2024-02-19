package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favorite.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:11:47
 */
public class AlipayOpenMiniMiniappFavoriteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5118493518873443455L;

	/** 
	 * 用户是否已收藏调用方的小程序
	 */
	@ApiField("favorite")
	private Boolean favorite;

	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}
	public Boolean getFavorite( ) {
		return this.favorite;
	}

}
