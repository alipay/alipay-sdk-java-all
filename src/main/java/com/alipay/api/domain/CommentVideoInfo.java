package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社交动态视频信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class CommentVideoInfo extends AlipayObject {

	private static final long serialVersionUID = 3313754496273145268L;

	/**
	 * 高度(px)
	 */
	@ApiField("height")
	private String height;

	/**
	 * 缩略图ID（djangoId）
	 */
	@ApiField("img_id")
	private String imgId;

	/**
	 * 视频ID（djangoId）
	 */
	@ApiField("video_id")
	private String videoId;

	/**
	 * 宽度(px)
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
