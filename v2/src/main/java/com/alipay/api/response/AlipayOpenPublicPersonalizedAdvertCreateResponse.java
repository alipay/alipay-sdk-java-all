package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.advert.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:07:01
 */
public class AlipayOpenPublicPersonalizedAdvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8584463986521478645L;

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
