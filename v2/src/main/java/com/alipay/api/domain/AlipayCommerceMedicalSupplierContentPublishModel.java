package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗内容发布接口
 *
 * @author auto create
 * @since 1.0, 2025-04-23 11:23:00
 */
public class AlipayCommerceMedicalSupplierContentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 3732122457374736341L;

	/**
	 * 内容作者，预留字段，当前不透出给用户
	 */
	@ApiField("author")
	private String author;

	/**
	 * 外部内容ID，作为外部的唯一标识
	 */
	@ApiField("biz_content_id")
	private String bizContentId;

	/**
	 * 内容正文
	 */
	@ApiField("content")
	private String content;

	/**
	 * 素材列表
	 */
	@ApiListField("media_info_list")
	@ApiField("media_info")
	private List<MediaInfo> mediaInfoList;

	/**
	 * 来源文章的原始链接地址
	 */
	@ApiField("original_link")
	private String originalLink;

	/**
	 * 和onwer_type搭配使用，当类型为生活号时传生活号ID(publishID)，当类型为作者ID时，好大夫医生ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 内容归属类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 内容分发范围。1 - 所有人可见，2 - 分发范围受限，默认是所有人可见
	 */
	@ApiField("permission_status")
	private String permissionStatus;

	/**
	 * 文章发布时间 仅支持 yyyy-MM-dd HH:mm:ss 格式， 且发布时间的范围为：大于相对于当前时间+15分钟，小于相对于当前时间+7天
	 */
	@ApiField("publish_date")
	private Date publishDate;

	/**
	 * 内容来源，接入前找医疗频道分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 文章摘要；预留字段，当前不对用户透出
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 内容类型
	 */
	@ApiField("type")
	private String type;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBizContentId() {
		return this.bizContentId;
	}
	public void setBizContentId(String bizContentId) {
		this.bizContentId = bizContentId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<MediaInfo> getMediaInfoList() {
		return this.mediaInfoList;
	}
	public void setMediaInfoList(List<MediaInfo> mediaInfoList) {
		this.mediaInfoList = mediaInfoList;
	}

	public String getOriginalLink() {
		return this.originalLink;
	}
	public void setOriginalLink(String originalLink) {
		this.originalLink = originalLink;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getPermissionStatus() {
		return this.permissionStatus;
	}
	public void setPermissionStatus(String permissionStatus) {
		this.permissionStatus = permissionStatus;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
