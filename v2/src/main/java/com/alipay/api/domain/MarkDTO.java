package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 印记
 *
 * @author auto create
 * @since 1.0, 2025-01-08 14:57:24
 */
public class MarkDTO extends AlipayObject {

	private static final long serialVersionUID = 7398828441285242883L;

	/**
	 * null
	 */
	@ApiListField("pic_urls")
	@ApiField("string")
	private List<String> picUrls;

	/**
	 * null
	 */
	@ApiListField("video_card_vo")
	@ApiField("string")
	private List<String> videoCardVo;

	public List<String> getPicUrls() {
		return this.picUrls;
	}
	public void setPicUrls(List<String> picUrls) {
		this.picUrls = picUrls;
	}

	public List<String> getVideoCardVo() {
		return this.videoCardVo;
	}
	public void setVideoCardVo(List<String> videoCardVo) {
		this.videoCardVo = videoCardVo;
	}

}
