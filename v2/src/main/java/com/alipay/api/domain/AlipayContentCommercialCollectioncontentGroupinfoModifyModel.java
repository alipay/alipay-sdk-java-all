package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 编辑优酷合集内容信息
 *
 * @author auto create
 * @since 1.0, 2025-08-28 16:56:13
 */
public class AlipayContentCommercialCollectioncontentGroupinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4257618945395169339L;

	/**
	 * 背景图
	 */
	@ApiField("banner_url")
	private String bannerUrl;

	/**
	 * 一级分类
	 */
	@ApiField("collection_category")
	private String collectionCategory;

	/**
	 * 合集ID，对应优酷的视频资源ID
	 */
	@ApiField("collection_id")
	private String collectionId;

	/**
	 * 合集/短剧对应的名称
	 */
	@ApiField("collection_name")
	private String collectionName;

	/**
	 * 二级分类
	 */
	@ApiField("collection_second_category")
	private String collectionSecondCategory;

	/**
	 * 是否已完结； 已完结：1 未完结：2
	 */
	@ApiField("completed_status")
	private String completedStatus;

	/**
	 * 短视频素材来源
	 */
	@ApiField("content_source")
	private String contentSource;

	/**
	 * 总集数，代表合集/短剧的总集数
	 */
	@ApiField("episodes_count")
	private String episodesCount;

	/**
	 * 更新到第几集
	 */
	@ApiField("episodes_number")
	private String episodesNumber;

	/**
	 * 请求类型：1: 新增短素材 2 编辑短素材 3 删除短素材 4 编辑合集内容
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 短十字箴言
	 */
	@ApiField("short_title")
	private String shortTitle;

	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public String getCollectionCategory() {
		return this.collectionCategory;
	}
	public void setCollectionCategory(String collectionCategory) {
		this.collectionCategory = collectionCategory;
	}

	public String getCollectionId() {
		return this.collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public String getCollectionName() {
		return this.collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCollectionSecondCategory() {
		return this.collectionSecondCategory;
	}
	public void setCollectionSecondCategory(String collectionSecondCategory) {
		this.collectionSecondCategory = collectionSecondCategory;
	}

	public String getCompletedStatus() {
		return this.completedStatus;
	}
	public void setCompletedStatus(String completedStatus) {
		this.completedStatus = completedStatus;
	}

	public String getContentSource() {
		return this.contentSource;
	}
	public void setContentSource(String contentSource) {
		this.contentSource = contentSource;
	}

	public String getEpisodesCount() {
		return this.episodesCount;
	}
	public void setEpisodesCount(String episodesCount) {
		this.episodesCount = episodesCount;
	}

	public String getEpisodesNumber() {
		return this.episodesNumber;
	}
	public void setEpisodesNumber(String episodesNumber) {
		this.episodesNumber = episodesNumber;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getShortTitle() {
		return this.shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

}
