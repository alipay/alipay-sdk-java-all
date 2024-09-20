package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库-问答-修改
 *
 * @author auto create
 * @since 1.0, 2024-08-13 20:45:16
 */
public class AlipayIserviceCcmSwArticleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1671793157981852133L;

	/**
	 * 附件列表
	 */
	@ApiListField("attachments")
	@ApiField("article_attachment_info")
	private List<ArticleAttachmentInfo> attachments;

	/**
	 * 所属类目ID，如果search_all_category为true则不用填
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展标题
	 */
	@ApiListField("extend_titles")
	@ApiField("string")
	private List<String> extendTitles;

	/**
	 * 文章ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 标签
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 有效期结束时间
	 */
	@ApiField("publish_end")
	private Date publishEnd;

	/**
	 * 有效期开始时间
	 */
	@ApiField("publish_start")
	private Date publishStart;

	/**
	 * 关联知识点列表
	 */
	@ApiListField("related_articles")
	@ApiField("base_article_info")
	private List<BaseArticleInfo> relatedArticles;

	/**
	 * 场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）
	 */
	@ApiListField("scene_codes")
	@ApiField("string")
	private List<String> sceneCodes;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public List<ArticleAttachmentInfo> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<ArticleAttachmentInfo> attachments) {
		this.attachments = attachments;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getExtendTitles() {
		return this.extendTitles;
	}
	public void setExtendTitles(List<String> extendTitles) {
		this.extendTitles = extendTitles;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public Date getPublishEnd() {
		return this.publishEnd;
	}
	public void setPublishEnd(Date publishEnd) {
		this.publishEnd = publishEnd;
	}

	public Date getPublishStart() {
		return this.publishStart;
	}
	public void setPublishStart(Date publishStart) {
		this.publishStart = publishStart;
	}

	public List<BaseArticleInfo> getRelatedArticles() {
		return this.relatedArticles;
	}
	public void setRelatedArticles(List<BaseArticleInfo> relatedArticles) {
		this.relatedArticles = relatedArticles;
	}

	public List<String> getSceneCodes() {
		return this.sceneCodes;
	}
	public void setSceneCodes(List<String> sceneCodes) {
		this.sceneCodes = sceneCodes;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
