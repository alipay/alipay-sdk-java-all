package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链接消息模型
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:58:09
 */
public class LinkMsgVO extends AlipayObject {

	private static final long serialVersionUID = 4719536287144325146L;

	/**
	 * 消息描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片文件id，请先通过图片上传接口上传图片<a href="https://opendocs.alipay.com/apis/036ros">https://opendocs.alipay.com/apis/036ros</a>并获取到 file_id 作为这个入参的值
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 消息标题，c侧消息展示的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 消息跳转地址，输入alipays:// 或者 https://的链接
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
