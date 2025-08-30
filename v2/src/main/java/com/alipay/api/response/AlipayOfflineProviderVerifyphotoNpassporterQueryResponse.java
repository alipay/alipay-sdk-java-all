package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.verifyphoto.npassporter.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-05 20:32:35
 */
public class AlipayOfflineProviderVerifyphotoNpassporterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6378497193168565418L;

	/** 
	 * 字符串
	 */
	@ApiField("photo_url")
	private String photoUrl;

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getPhotoUrl( ) {
		return this.photoUrl;
	}

}
