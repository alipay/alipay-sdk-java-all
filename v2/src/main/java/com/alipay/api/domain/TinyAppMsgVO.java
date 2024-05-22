package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序消息内容
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:15:19
 */
public class TinyAppMsgVO extends AlipayObject {

	private static final long serialVersionUID = 5668521859979468226L;

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
	 * 图片id
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 建议选择有吸引力的图片，引导用户点击链接（支持的图片 jpg、png，限制1M以内)
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 应用id。用于入群欢迎语在群里展示。
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/**
	 * 用于入群欢迎语的消息展示。
	 */
	@ApiField("tiny_app_logo")
	private String tinyAppLogo;

	/**
	 * 小程序名称
	 */
	@ApiField("tiny_app_name")
	private String tinyAppName;

	/**
	 * 推送的消息文案标题（参考：好物分享来咯！）
	 */
	@ApiField("title")
	private String title;

	/**
	 * 自定义链接或小程序页面链接（自定义链接请输入http,https或alipays开头的链接）
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

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

	public String getTinyAppLogo() {
		return this.tinyAppLogo;
	}
	public void setTinyAppLogo(String tinyAppLogo) {
		this.tinyAppLogo = tinyAppLogo;
	}

	public String getTinyAppName() {
		return this.tinyAppName;
	}
	public void setTinyAppName(String tinyAppName) {
		this.tinyAppName = tinyAppName;
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
