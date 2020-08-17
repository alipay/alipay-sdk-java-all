package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图文消息具体内容
 *
 * @author auto create
 * @since 1.0, 2020-07-01 15:00:07
 */
public class ImageTextItem extends AlipayObject {

	private static final long serialVersionUID = 4643518685611542211L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 封面图链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 文章内容id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
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
