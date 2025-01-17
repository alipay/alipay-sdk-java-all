package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文章信息
 *
 * @author auto create
 * @since 1.0, 2021-01-11 11:04:14
 */
public class ArticleInfo extends AlipayObject {

	private static final long serialVersionUID = 7315859524776961822L;

	/**
	 * 文章对应附件集合
	 */
	@ApiListField("attachments")
	@ApiField("article_attachment_info")
	private List<ArticleAttachmentInfo> attachments;

	/**
	 * 所属类目ID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 类目名称路径
	 */
	@ApiField("category_name_path")
	private String categoryNamePath;

	/**
	 * 类目路径
	 */
	@ApiListField("category_path")
	@ApiField("article_category_info")
	private List<ArticleCategoryInfo> categoryPath;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 创建人
	 */
	@ApiField("creator_id")
	private String creatorId;

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
	 * 知识库ID
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 排序值
	 */
	@ApiField("order_no")
	private Long orderNo;

	/**
	 * 文章对应图片集合
	 */
	@ApiListField("pictures")
	@ApiField("article_attachment_info")
	private List<ArticleAttachmentInfo> pictures;

	/**
	 * 有效期止
	 */
	@ApiField("publish_end")
	private Date publishEnd;

	/**
	 * 有效期起始
	 */
	@ApiField("publish_start")
	private Date publishStart;

	/**
	 * 场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）
	 */
	@ApiListField("scene_codes")
	@ApiField("string")
	private List<String> sceneCodes;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 文章状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 文章状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 修改时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 修改人
	 */
	@ApiField("updater_id")
	private String updaterId;

	/**
	 * 修改人名称
	 */
	@ApiField("updater_name")
	private String updaterName;

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

	public String getCategoryNamePath() {
		return this.categoryNamePath;
	}
	public void setCategoryNamePath(String categoryNamePath) {
		this.categoryNamePath = categoryNamePath;
	}

	public List<ArticleCategoryInfo> getCategoryPath() {
		return this.categoryPath;
	}
	public void setCategoryPath(List<ArticleCategoryInfo> categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
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

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public Long getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public List<ArticleAttachmentInfo> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<ArticleAttachmentInfo> pictures) {
		this.pictures = pictures;
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

	public List<String> getSceneCodes() {
		return this.sceneCodes;
	}
	public void setSceneCodes(List<String> sceneCodes) {
		this.sceneCodes = sceneCodes;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdaterId() {
		return this.updaterId;
	}
	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

	public String getUpdaterName() {
		return this.updaterName;
	}
	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName;
	}

}
