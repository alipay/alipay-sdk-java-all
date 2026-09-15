package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.shortplay.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 23:42:52
 */
public class AlipaySocialBaseLifecreationShortplayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8734217311179777733L;

	/** 
	 * 短剧唯一标识（剧库ID）
	 */
	@ApiField("album_id")
	private String albumId;

	/** 
	 * 新版本号（每次编辑 +1）
	 */
	@ApiField("lib_version")
	private String libVersion;

	/** 
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumId( ) {
		return this.albumId;
	}

	public void setLibVersion(String libVersion) {
		this.libVersion = libVersion;
	}
	public String getLibVersion( ) {
		return this.libVersion;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateTime( ) {
		return this.updateTime;
	}

}
