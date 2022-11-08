package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 封面容器，封装封面上部展示的图片或视频
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftTemplateFrontCoverBox extends AlipayObject {

	private static final long serialVersionUID = 4412545587285944799L;

	/**
	 * 封面图，使用于在拆红包页、红包详情页
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 异形封面图
	 */
	@ApiField("special_shaped_url")
	private String specialShapedUrl;

	/**
	 * 封面视频，使用在拆红包页与红包详情页
	 */
	@ApiField("video_url")
	private String videoUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getSpecialShapedUrl() {
		return this.specialShapedUrl;
	}
	public void setSpecialShapedUrl(String specialShapedUrl) {
		this.specialShapedUrl = specialShapedUrl;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
