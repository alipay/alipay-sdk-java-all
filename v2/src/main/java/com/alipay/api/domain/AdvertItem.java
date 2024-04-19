package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告位轮播内容
 *
 * @author auto create
 * @since 1.0, 2020-10-14 16:21:24
 */
public class AdvertItem extends AlipayObject {

	private static final long serialVersionUID = 6887755613936543124L;

	/**
	 * 广告图片url, 尺寸为996*240，最大不超过5M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转类型，网页:HTTP、小程序:APP，不传默认HTTP
	 */
	@ApiField("link_type")
	private String linkType;

	/**
	 * 跳转链接，点击广告图片跳到的链接url
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 广告帧名称，可选
	 */
	@ApiField("name")
	private String name;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLinkType() {
		return this.linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
