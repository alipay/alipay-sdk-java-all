package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.shortplay.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 16:02:15
 */
public class AlipaySocialBaseLifecreationShortplayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3727893845463579698L;

	/** 
	 * 短剧唯一标识（剧库ID）
	 */
	@ApiField("album_id")
	private String albumId;

	/** 
	 * 版本
	 */
	@ApiField("lib_version")
	private Long libVersion;

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumId( ) {
		return this.albumId;
	}

	public void setLibVersion(Long libVersion) {
		this.libVersion = libVersion;
	}
	public Long getLibVersion( ) {
		return this.libVersion;
	}

}
