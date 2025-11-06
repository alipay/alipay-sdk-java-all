package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兴趣社区发布内容的媒体信息
 *
 * @author auto create
 * @since 1.0, 2025-01-16 15:37:24
 */
public class IcommunityContentMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 1661134841831528441L;

	/**
	 * 视频资源的封面图片的资源id
	 */
	@ApiField("cover_img_src")
	private String coverImgSrc;

	/**
	 * 关联资源的高度，单位px
	 */
	@ApiField("media_content_height")
	private Long mediaContentHeight;

	/**
	 * 关联资源的宽度，单位px
	 */
	@ApiField("media_content_width")
	private Long mediaContentWidth;

	/**
	 * 媒体内容资源id
	 */
	@ApiField("media_src")
	private String mediaSrc;

	/**
	 * 内容关联的媒体类型
1."image"表示图片类型
2."video"表示视频类型
	 */
	@ApiField("media_type")
	private String mediaType;

	public String getCoverImgSrc() {
		return this.coverImgSrc;
	}
	public void setCoverImgSrc(String coverImgSrc) {
		this.coverImgSrc = coverImgSrc;
	}

	public Long getMediaContentHeight() {
		return this.mediaContentHeight;
	}
	public void setMediaContentHeight(Long mediaContentHeight) {
		this.mediaContentHeight = mediaContentHeight;
	}

	public Long getMediaContentWidth() {
		return this.mediaContentWidth;
	}
	public void setMediaContentWidth(Long mediaContentWidth) {
		this.mediaContentWidth = mediaContentWidth;
	}

	public String getMediaSrc() {
		return this.mediaSrc;
	}
	public void setMediaSrc(String mediaSrc) {
		this.mediaSrc = mediaSrc;
	}

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

}
