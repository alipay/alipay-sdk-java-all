package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 图文消息内容
 *
 * @author auto create
 * @since 1.0, 2025-09-11 10:24:33
 */
public class ImageTextMsgVO extends AlipayObject {

	private static final long serialVersionUID = 7312324996879618363L;

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
	 * 文字链接组合
	 */
	@ApiListField("text_link_list")
	@ApiField("text_link_v_o")
	private List<TextLinkVO> textLinkList;

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

	public List<TextLinkVO> getTextLinkList() {
		return this.textLinkList;
	}
	public void setTextLinkList(List<TextLinkVO> textLinkList) {
		this.textLinkList = textLinkList;
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
