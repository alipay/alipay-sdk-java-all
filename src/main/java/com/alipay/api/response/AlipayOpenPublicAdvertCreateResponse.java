package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:58:46
 */
public class AlipayOpenPublicAdvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4211643618356942268L;

	/** 
	 * 广告分组标识
	 */
	@ApiField("advert_group")
	private String advertGroup;

	/** 
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public void setAdvertGroup(String advertGroup) {
		this.advertGroup = advertGroup;
	}
	public String getAdvertGroup( ) {
		return this.advertGroup;
	}

	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}
	public String getAdvertId( ) {
		return this.advertId;
	}

}
