package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 封面基础信息,包含封面名称、祝福语等
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftTemplateBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 8116589153227418971L;

	/**
	 * 会话气泡图片
	 */
	@ApiField("card_image_url")
	private String cardImageUrl;

	/**
	 * 获取同款链接描述文案，用于封面详情页
	 */
	@ApiField("link_show_memo")
	private String linkShowMemo;

	/**
	 * 获取该封面的链接
	 */
	@ApiField("link_to_get")
	private String linkToGet;

	/**
	 * 封面祝福语
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 封面名称，”我的封面“页面展示用
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分享描述文案
	 */
	@ApiField("share_desc")
	private String shareDesc;

	/**
	 * 分享标题
	 */
	@ApiField("share_title")
	private String shareTitle;

	/**
	 * 分享链接
	 */
	@ApiField("share_url")
	private String shareUrl;

	/**
	 * 封面缩略图，用于发红包表单页
	 */
	@ApiField("template_form_thumbnail_url")
	private String templateFormThumbnailUrl;

	/**
	 * 封面缩略图，用于发红包页
	 */
	@ApiField("template_thumbnail")
	private String templateThumbnail;

	public String getCardImageUrl() {
		return this.cardImageUrl;
	}
	public void setCardImageUrl(String cardImageUrl) {
		this.cardImageUrl = cardImageUrl;
	}

	public String getLinkShowMemo() {
		return this.linkShowMemo;
	}
	public void setLinkShowMemo(String linkShowMemo) {
		this.linkShowMemo = linkShowMemo;
	}

	public String getLinkToGet() {
		return this.linkToGet;
	}
	public void setLinkToGet(String linkToGet) {
		this.linkToGet = linkToGet;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShareDesc() {
		return this.shareDesc;
	}
	public void setShareDesc(String shareDesc) {
		this.shareDesc = shareDesc;
	}

	public String getShareTitle() {
		return this.shareTitle;
	}
	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareUrl() {
		return this.shareUrl;
	}
	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getTemplateFormThumbnailUrl() {
		return this.templateFormThumbnailUrl;
	}
	public void setTemplateFormThumbnailUrl(String templateFormThumbnailUrl) {
		this.templateFormThumbnailUrl = templateFormThumbnailUrl;
	}

	public String getTemplateThumbnail() {
		return this.templateThumbnail;
	}
	public void setTemplateThumbnail(String templateThumbnail) {
		this.templateThumbnail = templateThumbnail;
	}

}
