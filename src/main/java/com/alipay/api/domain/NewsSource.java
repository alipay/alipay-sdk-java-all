package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索结果详情
 *
 * @author auto create
 * @since 1.0, 2022-03-03 10:47:04
 */
public class NewsSource extends AlipayObject {

	private static final long serialVersionUID = 4665523447213132534L;

	/**
	 * 作者名
	 */
	@ApiField("author_name")
	private String authorName;

	/**
	 * 打标结果
	 */
	@ApiListField("concerned")
	@ApiField("news_concerned")
	private List<NewsConcerned> concerned;

	/**
	 * 原文链接
	 */
	@ApiField("content_url")
	private String contentUrl;

	/**
	 * 文章指纹，此值相同表示为相似文章
	 */
	@ApiField("doc_self_content_sign")
	private String docSelfContentSign;

	/**
	 * 首发媒体名称
	 */
	@ApiField("first_publish_media")
	private String firstPublishMedia;

	/**
	 * 关键字高亮显示
	 */
	@ApiField("highlight")
	private KeywordsHighlight highlight;

	/**
	 * 图片资源列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 新闻来源的媒体
	 */
	@ApiField("media_source")
	private String mediaSource;

	/**
	 * 文章中的实体列表
	 */
	@ApiListField("ner_entities")
	@ApiField("news_ner_entity")
	private List<NewsNerEntity> nerEntities;

	/**
	 * 数据库中的唯一id
	 */
	@ApiField("obj_id")
	private String objId;

	/**
	 * 文章发布时间
	 */
	@ApiField("pub_time")
	private Date pubTime;

	/**
	 * 文章提及的公司列表
	 */
	@ApiListField("related_companies")
	@ApiField("news_related_company")
	private List<NewsRelatedCompany> relatedCompanies;

	/**
	 * 文章全文
	 */
	@ApiField("searchable_text")
	private String searchableText;

	/**
	 * 舆情平台的新闻唯一id
	 */
	@ApiField("source_doc_id")
	private String sourceDocId;

	/**
	 * 文档类型
	 */
	@ApiField("source_doc_type")
	private String sourceDocType;

	/**
	 * 文章类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 文档摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 文章标题
	 */
	@ApiField("title")
	private String title;

	public String getAuthorName() {
		return this.authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<NewsConcerned> getConcerned() {
		return this.concerned;
	}
	public void setConcerned(List<NewsConcerned> concerned) {
		this.concerned = concerned;
	}

	public String getContentUrl() {
		return this.contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getDocSelfContentSign() {
		return this.docSelfContentSign;
	}
	public void setDocSelfContentSign(String docSelfContentSign) {
		this.docSelfContentSign = docSelfContentSign;
	}

	public String getFirstPublishMedia() {
		return this.firstPublishMedia;
	}
	public void setFirstPublishMedia(String firstPublishMedia) {
		this.firstPublishMedia = firstPublishMedia;
	}

	public KeywordsHighlight getHighlight() {
		return this.highlight;
	}
	public void setHighlight(KeywordsHighlight highlight) {
		this.highlight = highlight;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getMediaSource() {
		return this.mediaSource;
	}
	public void setMediaSource(String mediaSource) {
		this.mediaSource = mediaSource;
	}

	public List<NewsNerEntity> getNerEntities() {
		return this.nerEntities;
	}
	public void setNerEntities(List<NewsNerEntity> nerEntities) {
		this.nerEntities = nerEntities;
	}

	public String getObjId() {
		return this.objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}

	public Date getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public List<NewsRelatedCompany> getRelatedCompanies() {
		return this.relatedCompanies;
	}
	public void setRelatedCompanies(List<NewsRelatedCompany> relatedCompanies) {
		this.relatedCompanies = relatedCompanies;
	}

	public String getSearchableText() {
		return this.searchableText;
	}
	public void setSearchableText(String searchableText) {
		this.searchableText = searchableText;
	}

	public String getSourceDocId() {
		return this.sourceDocId;
	}
	public void setSourceDocId(String sourceDocId) {
		this.sourceDocId = sourceDocId;
	}

	public String getSourceDocType() {
		return this.sourceDocType;
	}
	public void setSourceDocType(String sourceDocType) {
		this.sourceDocType = sourceDocType;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
