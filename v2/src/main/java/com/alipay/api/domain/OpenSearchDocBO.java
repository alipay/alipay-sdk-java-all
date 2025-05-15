package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Rag召回的doc
 *
 * @author auto create
 * @since 1.0, 2025-02-25 11:07:37
 */
public class OpenSearchDocBO extends AlipayObject {

	private static final long serialVersionUID = 5175689458336274744L;

	/**
	 * 短摘要
	 */
	@ApiField("abstract_extract")
	private String abstractExtract;

	/**
	 * 渠道来源网站
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 搜索的原文内容
	 */
	@ApiField("doc")
	private String doc;

	/**
	 * 搜索的内容摘要
	 */
	@ApiField("doc_abstract")
	private String docAbstract;

	/**
	 * 文档ID
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 原文链接地址
	 */
	@ApiField("doc_url")
	private String docUrl;

	/**
	 * 从正文抽取，默认采纳阈值>=0.1，分值0-1分
	 */
	@ApiField("model_abstract_score")
	private String modelAbstractScore;

	/**
	 * 配图合集
	 */
	@ApiField("pic_afts_url_list")
	private String picAftsUrlList;

	/**
	 * 图片对应的oss地址
	 */
	@ApiField("pic_oss_path")
	private String picOssPath;

	/**
	 * 发布时间戳
	 */
	@ApiField("publish_timestamp")
	private String publishTimestamp;

	/**
	 * 相关性打分，十分制
	 */
	@ApiField("rel_score")
	private String relScore;

	/**
	 * 评分,0-1分
	 */
	@ApiField("scale_score")
	private String scaleScore;

	/**
	 * 来源信息
	 */
	@ApiField("source")
	private String source;

	/**
	 * 文档标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 目前均为文本：text
	 */
	@ApiField("type")
	private String type;

	public String getAbstractExtract() {
		return this.abstractExtract;
	}
	public void setAbstractExtract(String abstractExtract) {
		this.abstractExtract = abstractExtract;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDoc() {
		return this.doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getDocAbstract() {
		return this.docAbstract;
	}
	public void setDocAbstract(String docAbstract) {
		this.docAbstract = docAbstract;
	}

	public String getDocId() {
		return this.docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocUrl() {
		return this.docUrl;
	}
	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getModelAbstractScore() {
		return this.modelAbstractScore;
	}
	public void setModelAbstractScore(String modelAbstractScore) {
		this.modelAbstractScore = modelAbstractScore;
	}

	public String getPicAftsUrlList() {
		return this.picAftsUrlList;
	}
	public void setPicAftsUrlList(String picAftsUrlList) {
		this.picAftsUrlList = picAftsUrlList;
	}

	public String getPicOssPath() {
		return this.picOssPath;
	}
	public void setPicOssPath(String picOssPath) {
		this.picOssPath = picOssPath;
	}

	public String getPublishTimestamp() {
		return this.publishTimestamp;
	}
	public void setPublishTimestamp(String publishTimestamp) {
		this.publishTimestamp = publishTimestamp;
	}

	public String getRelScore() {
		return this.relScore;
	}
	public void setRelScore(String relScore) {
		this.relScore = relScore;
	}

	public String getScaleScore() {
		return this.scaleScore;
	}
	public void setScaleScore(String scaleScore) {
		this.scaleScore = scaleScore;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
