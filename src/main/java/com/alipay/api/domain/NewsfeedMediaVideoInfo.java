package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频动态的描述数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class NewsfeedMediaVideoInfo extends AlipayObject {

	private static final long serialVersionUID = 5291344556627392146L;

	/**
	 * 高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 视频缩略图的ID（支持djangoId）
	 */
	@ApiField("img_id")
	private String imgId;

	/**
	 * 视频的id（支持djangoId）
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 宽度
	 */
	@ApiField("width")
	private String width;

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getImgId() {
		return this.imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getVideoId() {
		return this.videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
