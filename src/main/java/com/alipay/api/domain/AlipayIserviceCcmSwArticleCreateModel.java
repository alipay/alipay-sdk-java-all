package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库-问答-创建
 *
 * @author auto create
 * @since 1.0, 2021-03-30 20:15:28
 */
public class AlipayIserviceCcmSwArticleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2227242638149412455L;

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
	 * 标签
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 知识库ID
	 */
	@ApiField("library_id")
	private String libraryId;

	/**
	 * 场景ID。KNOWLEDGE（内部知识库）；ROBOT（机器人）;HELP（帮助中心）；WHELP（无线帮助中心）
	 */
	@ApiListField("scene_codes")
	@ApiField("string")
	private List<String> sceneCodes;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

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

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public String getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
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
