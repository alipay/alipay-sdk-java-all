package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:52:47
 */
public class KoubeiCraftsmanDataProviderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1178128714738369758L;

	/** 
	 * 手艺人id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}
	public String getCraftsmanId( ) {
		return this.craftsmanId;
	}

}
