package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 飞猪内容对接内容创建修改接口
 *
 * @author auto create
 * @since 1.0, 2017-12-21 11:09:10
 */
public class AlipayOverseasTravelContentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3565759368374292873L;

	/**
	 * 内容作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 内容分类code
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 内容分类名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 内容详情，不包含页面样式
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 内容封面
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 内容详情H5链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 图片链接列表，单个image大小不超过4096，image个数不超过50
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 内容修改时间，请确保本次修改的时间大于上一次修改的时间
	 */
	@ApiField("modified_date")
	private Long modifiedDate;

	/**
	 * poi列表，单个poi名称大小不超过512，poi个数不超过50个
	 */
	@ApiListField("poi_list")
	@ApiField("content_poi_data")
	private List<ContentPoiData> poiList;

	/**
	 * 内容发布时间
	 */
	@ApiField("publish_date")
	private Long publishDate;

	/**
	 * 标签列表，单个tag大小不超过128，tag个数不超过1000
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public Long getModifiedDate() {
		return this.modifiedDate;
	}
	public void setModifiedDate(Long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<ContentPoiData> getPoiList() {
		return this.poiList;
	}
	public void setPoiList(List<ContentPoiData> poiList) {
		this.poiList = poiList;
	}

	public Long getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Long publishDate) {
		this.publishDate = publishDate;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
