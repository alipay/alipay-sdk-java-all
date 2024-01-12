package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.forest.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 06:06:47
 */
public class AlipayUserCharityForestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7289888721889813287L;

	/** 
	 * 是否开通了蚂蚁森林
	 */
	@ApiField("forest_user")
	private Boolean forestUser;

	public void setForestUser(Boolean forestUser) {
		this.forestUser = forestUser;
	}
	public Boolean getForestUser( ) {
		return this.forestUser;
	}

}
