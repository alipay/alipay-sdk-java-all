package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图文消息内容
 *
 * @author auto create
 * @since 1.0, 2024-04-16 19:58:35
 */
public class ImageTextMsgVO extends AlipayObject {

	private static final long serialVersionUID = 6834122667492537796L;

	/**
	 * 对推送商品的简单介绍（参考：美妆好物应有尽有，快戳进来看看呀）
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 建议选择有吸引力的图片，引导用户点击链接（支持的图片 jpg、png，400*200，限制1M以内)
	 */
	@ApiField("image")
	private String image;

	/**
	 * 推送的消息文案标题（参考：好物分享来咯！）
	 */
	@ApiField("title")
	private String title;

	/**
	 * 自定义链接或小程序页面链接（自定义链接请输入http,https或alipays开头的链接；小程序链接获取方式---获取小程序链接）
	 */
	@ApiField("url")
	private String url;

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
