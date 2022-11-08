package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链接消息模板
 *
 * @author auto create
 * @since 1.0, 2022-10-31 17:44:16
 */
public class LinksTemplateData extends AlipayObject {

	private static final long serialVersionUID = 7779335158948159918L;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片链接
	 */
	@ApiField("image")
	private String image;

	/**
	 * 调整地址
	 */
	@ApiField("link")
	private String link;

	/**
	 * 链接标题
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
