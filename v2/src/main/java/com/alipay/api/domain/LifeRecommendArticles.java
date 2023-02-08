package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容咨询类推荐文章列表
 *
 * @author auto create
 * @since 1.0, 2017-06-22 11:44:23
 */
public class LifeRecommendArticles extends AlipayObject {

	private static final long serialVersionUID = 8525166811357863691L;

	/**
	 * 文章id
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * 文章封面图片
	 */
	@ApiField("article_image")
	private String articleImage;

	/**
	 * 支付宝钱包的文章详情地址
	 */
	@ApiField("article_link")
	private String articleLink;

	/**
	 * 文章阅读数
	 */
	@ApiField("article_read_cnt")
	private String articleReadCnt;

	/**
	 * 文章来源
	 */
	@ApiField("article_source")
	private String articleSource;

	/**
	 * 文章的标题
	 */
	@ApiField("article_title")
	private String articleTitle;

	public String getArticleId() {
		return this.articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getArticleImage() {
		return this.articleImage;
	}
	public void setArticleImage(String articleImage) {
		this.articleImage = articleImage;
	}

	public String getArticleLink() {
		return this.articleLink;
	}
	public void setArticleLink(String articleLink) {
		this.articleLink = articleLink;
	}

	public String getArticleReadCnt() {
		return this.articleReadCnt;
	}
	public void setArticleReadCnt(String articleReadCnt) {
		this.articleReadCnt = articleReadCnt;
	}

	public String getArticleSource() {
		return this.articleSource;
	}
	public void setArticleSource(String articleSource) {
		this.articleSource = articleSource;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

}
