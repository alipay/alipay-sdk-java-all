package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号素材内容落库接口
 *
 * @author auto create
 * @since 1.0, 2020-06-30 15:28:13
 */
public class AlipayOpenPublicContentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 8394316325788152495L;

	/**
	 * action_url 文章地址url，用于文章列表显示，用户点击后的跳转地址。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * article_id 为调用方的文章id，用于生活号对输入的文章进行去重检测
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * content 为写文章完整的正文文本内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * cover_img 用于内容在文章列表中展示时的配图
	 */
	@ApiField("cover_img")
	private String coverImg;

	/**
	 * desc 用于描述文章简介
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * endTime 用于描述文章内容有效截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * source 用于描述调用接口的业务方
	 */
	@ApiField("source")
	private String source;

	/**
	 * title 用于描述文章标题
	 */
	@ApiField("title")
	private String title;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getArticleId() {
		return this.articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverImg() {
		return this.coverImg;
	}
	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
