package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favorite.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-14 10:20:39
 */
public class AlipayOpenMiniMiniappFavoriteAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3259871782763357939L;

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
