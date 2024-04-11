package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.facetoface.decode.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 22:48:34
 */
public class AlipayMarketingFacetofaceDecodeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7397772697685873794L;

	/** 
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
