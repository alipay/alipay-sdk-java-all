package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 类目信息VO
 *
 * @author auto create
 * @since 1.0, 2023-08-31 19:34:52
 */
public class AppxCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 3487352369472926423L;

	/**
	 * 类目编号
	 */
	@ApiField("cat_id")
	private String catId;

	/**
	 * 类目层级
	 */
	@ApiField("cat_level")
	private Long catLevel;

	/**
	 * 类目名称
	 */
	@ApiField("cat_name")
	private String catName;

	/**
	 * 仅叶子节点有类目状态
	 */
	@ApiField("cat_status")
	private String catStatus;

	/**
	 * 父类目编号
	 */
	@ApiField("f_cat_id")
	private String fCatId;

	/**
	 * 商品类型
	 */
	@ApiListField("item_types")
	@ApiField("string")
	private List<String> itemTypes;

	/**
	 * 开通状态。只有叶子结点有开通状态 当前字段已废弃(请参考cat_status字段获取当前类目的资质状态以及邀约状态等)
	 */
	@ApiField("qualification_status")
	@Deprecated
	private String qualificationStatus;

	public String getCatId() {
		return this.catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}

	public Long getCatLevel() {
		return this.catLevel;
	}
	public void setCatLevel(Long catLevel) {
		this.catLevel = catLevel;
	}

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatStatus() {
		return this.catStatus;
	}
	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}

	public String getfCatId() {
		return this.fCatId;
	}
	public void setfCatId(String fCatId) {
		this.fCatId = fCatId;
	}

	public List<String> getItemTypes() {
		return this.itemTypes;
	}
	public void setItemTypes(List<String> itemTypes) {
		this.itemTypes = itemTypes;
	}

	public String getQualificationStatus() {
		return this.qualificationStatus;
	}
	public void setQualificationStatus(String qualificationStatus) {
		this.qualificationStatus = qualificationStatus;
	}

}
