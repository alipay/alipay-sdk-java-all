package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class ExaminationCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 7319436388726628894L;

	/**
	 * 标签id
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目状态
	 */
	@ApiField("category_state")
	private String categoryState;

	/**
	 * 类目类型，
检查类目类型:CHECK_CATEGORY、
检验类目类型：INSPECTION_CATEGORY
不传，默认查全部
	 */
	@ApiField("category_type")
	private String categoryType;

	/**
	 * null
	 */
	@ApiListField("children_list")
	@ApiField("examination_second_category_info")
	private List<ExaminationSecondCategoryInfo> childrenList;

	/**
	 * 类目id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否叶子节点
	 */
	@ApiField("is_leaf")
	private Long isLeaf;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 父类目id
	 */
	@ApiField("parent_id")
	private Long parentId;

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

	public String getCategoryState() {
		return this.categoryState;
	}
	public void setCategoryState(String categoryState) {
		this.categoryState = categoryState;
	}

	public String getCategoryType() {
		return this.categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public List<ExaminationSecondCategoryInfo> getChildrenList() {
		return this.childrenList;
	}
	public void setChildrenList(List<ExaminationSecondCategoryInfo> childrenList) {
		this.childrenList = childrenList;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getIsLeaf() {
		return this.isLeaf;
	}
	public void setIsLeaf(Long isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

}
