package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品视频信息详情
 *
 * @author auto create
 * @since 1.0, 2024-08-23 16:23:20
 */
public class VideoInfo extends AlipayObject {

	private static final long serialVersionUID = 4393177461155933366L;

	/**
	 * 视频时长，单位为秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 视频高度
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 视频原始的Ur
	 */
	@ApiField("origin_url")
	private String originUrl;

	/**
	 * 视频转存在oss中的地址url
	 */
	@ApiField("oss_url")
	private String ossUrl;

	/**
	 * 视频封面图片url
	 */
	@ApiField("poster_url")
	private String posterUrl;

	/**
	 * 可以用来识别内容相同的视频
	 */
	@ApiField("signature")
	private String signature;

	/**
	 * 视频大小，单位为MB
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 视频URL地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 视频宽度
	 */
	@ApiField("width")
	private Long width;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getOriginUrl() {
		return this.originUrl;
	}
	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public String getOssUrl() {
		return this.ossUrl;
	}
	public void setOssUrl(String ossUrl) {
		this.ossUrl = ossUrl;
	}

	public String getPosterUrl() {
		return this.posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
