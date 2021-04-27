package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库问答管理
 *
 * @author auto create
 * @since 1.0, 2020-11-16 16:22:05
 */
public class AlipayIserviceCcmSwKnowledgeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3752918644522627611L;

	/**
	 * 所属类目ID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 知识点所属类目
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 知识点答案内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 外部知识点ID
	 */
	@ApiField("ext_id")
	private String extId;

	/**
	 * 扩展标题（问法）
	 */
	@ApiListField("extend_titles")
	@ApiField("string")
	private List<String> extendTitles;

	/**
	 * 问答关联图片附件地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 知识点ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 默认为false，为true且id非空时，表示删除知识点
	 */
	@ApiField("is_delete")
	private Boolean isDelete;

	/**
	 * 是否被检索到，默认false，系统希望为true
	 */
	@ApiField("is_searchable")
	private Boolean isSearchable;

	/**
	 * 知识库ID
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 知识库名称
	 */
	@ApiField("library_name")
	private String libraryName;

	/**
	 * 关联商品信息
	 */
	@ApiField("spu")
	private SpuDetail spu;

	/**
	 * 以逗号分割的字符串列表
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 知识点标题
	 */
	@ApiField("title")
	private String title;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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

	public String getExtId() {
		return this.extId;
	}
	public void setExtId(String extId) {
		this.extId = extId;
	}

	public List<String> getExtendTitles() {
		return this.extendTitles;
	}
	public void setExtendTitles(List<String> extendTitles) {
		this.extendTitles = extendTitles;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsDelete() {
		return this.isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsSearchable() {
		return this.isSearchable;
	}
	public void setIsSearchable(Boolean isSearchable) {
		this.isSearchable = isSearchable;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return this.libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public SpuDetail getSpu() {
		return this.spu;
	}
	public void setSpu(SpuDetail spu) {
		this.spu = spu;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
