package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库_附件创建
 *
 * @author auto create
 * @since 1.0, 2024-08-13 19:57:47
 */
public class AlipayIserviceCcmSwAttachmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2883554751464851551L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 文件全程，包含文件后缀
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 数据库id
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 可见范围，forward 或 inward
	 */
	@ApiField("security")
	private String security;

	/**
	 * 文件显示名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 可公网访问的文件地址
	 */
	@ApiField("url")
	private String url;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getSecurity() {
		return this.security;
	}
	public void setSecurity(String security) {
		this.security = security;
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
