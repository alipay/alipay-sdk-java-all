package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容相关的素材
 *
 * @author auto create
 * @since 1.0, 2025-04-23 11:22:59
 */
public class MediaInfo extends AlipayObject {

	private static final long serialVersionUID = 8621172895139653346L;

	/**
	 * 素材资源地址
	 */
	@ApiField("media_source")
	private String mediaSource;

	/**
	 * 素材类型
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 素材资源地址
	 */
	@ApiField("media_url")
	private String mediaUrl;

	public String getMediaSource() {
		return this.mediaSource;
	}
	public void setMediaSource(String mediaSource) {
		this.mediaSource = mediaSource;
	}

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getMediaUrl() {
		return this.mediaUrl;
	}
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

}
