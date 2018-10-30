package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销位内容
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:22:08
 */
public class TopicItem extends AlipayObject {

	private static final long serialVersionUID = 3316349479356533252L;

	/**
	 * 内容图片url, 尺寸为300*300，最大不超过3M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转链接，点击营销位内容图片跳到的链接url
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 内容说明
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
