package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 来源媒体信息
 *
 * @author auto create
 * @since 1.0, 2026-01-23 10:07:43
 */
public class ShortPlaySourceMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 7261933555492239424L;

	/**
	 * 素材ID，对应“支付宝文件上传接口”获取的file_id
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 素材类型。 video：视频 cover_static：静态封面
	 */
	@ApiField("media_type")
	private String mediaType;

	public String getMediaId() {
		return this.mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

}
