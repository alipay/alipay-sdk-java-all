package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.advert.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:48:43
 */
public class AlipayOpenPublicPersonalizedAdvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5366446225355685346L;

	/** 
	 * 轮播广告分组id
	 */
	@ApiField("advert_group")
	private String advertGroup;

	public void setAdvertGroup(String advertGroup) {
		this.advertGroup = advertGroup;
	}
	public String getAdvertGroup( ) {
		return this.advertGroup;
	}

}
