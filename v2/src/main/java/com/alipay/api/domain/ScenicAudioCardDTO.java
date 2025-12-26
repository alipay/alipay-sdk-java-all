package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 音频介绍卡片1
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class ScenicAudioCardDTO extends AlipayObject {

	private static final long serialVersionUID = 8469218635584998875L;

	/**
	 * 语音讲解url
	 */
	@ApiField("audio_url")
	private String audioUrl;

	/**
	 * 景点图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 卡片类型
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * null
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 讲解卡片推荐文本
	 */
	@ApiField("text")
	private String text;

	/**
	 * 讲解卡片内容
	 */
	@ApiField("title")
	private String title;

	public String getAudioUrl() {
		return this.audioUrl;
	}
	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
