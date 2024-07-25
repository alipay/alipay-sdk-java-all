package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品视频信息详情
 *
 * @author auto create
 * @since 1.0, 2024-06-19 15:32:16
 */
public class VideoInfo extends AlipayObject {

	private static final long serialVersionUID = 7554554278431443123L;

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
