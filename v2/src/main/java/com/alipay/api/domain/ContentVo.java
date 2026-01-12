package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息内容
 *
 * @author auto create
 * @since 1.0, 2025-11-18 13:54:22
 */
public class ContentVo extends AlipayObject {

	private static final long serialVersionUID = 4236739526659777438L;

	/**
	 * 消息类型为卡片时必传，卡片内容
	 */
	@ApiField("card_content")
	private String cardContent;

	/**
	 * 消息类型为卡片时必传，卡片标题
	 */
	@ApiField("card_title")
	private String cardTitle;

	/**
	 * 消息类型为卡片时必传
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 消息类型为视频时必传-视频封面图片afts文件id
（和cover_image_url二选一）
	 */
	@ApiField("cover_image_file_id")
	private String coverImageFileId;

	/**
	 * 消息类型为视频时必传
	 */
	@ApiField("cover_image_url")
	private String coverImageUrl;

	/**
	 * 自定义消息内容
	 */
	@ApiField("custom_data_content")
	private String customDataContent;

	/**
	 * 自定义消息类型
	 */
	@ApiField("custom_data_type")
	private String customDataType;

	/**
	 * 音视频播放时长，单位:秒（消息类型为音频、视频时必传）可以保留一位小数
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 消息类型为图片、音频、视频时必传
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 消息类型为文本时必传
	 */
	@ApiField("text")
	private String text;

	/**
	 * 消息类型为图片、音频、视频时必传
	 */
	@ApiField("url")
	private String url;

	/**
	 * 消息类型为图片、音频、视频时必传
	 */
	@ApiField("url_title")
	private String urlTitle;

	public String getCardContent() {
		return this.cardContent;
	}
	public void setCardContent(String cardContent) {
		this.cardContent = cardContent;
	}

	public String getCardTitle() {
		return this.cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCoverImageFileId() {
		return this.coverImageFileId;
	}
	public void setCoverImageFileId(String coverImageFileId) {
		this.coverImageFileId = coverImageFileId;
	}

	public String getCoverImageUrl() {
		return this.coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}

	public String getCustomDataContent() {
		return this.customDataContent;
	}
	public void setCustomDataContent(String customDataContent) {
		this.customDataContent = customDataContent;
	}

	public String getCustomDataType() {
		return this.customDataType;
	}
	public void setCustomDataType(String customDataType) {
		this.customDataType = customDataType;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlTitle() {
		return this.urlTitle;
	}
	public void setUrlTitle(String urlTitle) {
		this.urlTitle = urlTitle;
	}

}
