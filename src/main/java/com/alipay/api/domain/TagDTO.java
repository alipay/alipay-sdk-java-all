package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签信息
 *
 * @author auto create
 * @since 1.0, 2022-05-18 15:20:18
 */
public class TagDTO extends AlipayObject {

	private static final long serialVersionUID = 2115854714369628347L;

	/**
	 * 类目ID+唯一
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 类目名+不唯一
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 字段类型+不唯一
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 场景CODE+不唯一
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 显示方式+不唯一
	 */
	@ApiField("show_type")
	private String showType;

	/**
	 * 存储类型+不唯一
	 */
	@ApiField("store_type")
	private String storeType;

	/**
	 * 标签逻辑层编码+唯一
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签描述+不唯一
	 */
	@ApiField("tag_desc")
	private String tagDesc;

	/**
	 * 标签种类+不唯一
	 */
	@ApiField("tag_kind")
	private String tagKind;

	/**
	 * 标签名称+不唯一
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 标签类型+不唯一
	 */
	@ApiField("tag_type")
	private String tagType;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getStoreType() {
		return this.storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagDesc() {
		return this.tagDesc;
	}
	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
	}

	public String getTagKind() {
		return this.tagKind;
	}
	public void setTagKind(String tagKind) {
		this.tagKind = tagKind;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagType() {
		return this.tagType;
	}
	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

}
