package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 前台类目更新
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:59:48
 */
public class AntMerchantExpandFrontcategorySecurityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8748143247138379269L;

	/**
	 * 前台类目描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 素材列表（会和前台类目已存在素材做差异化比较后做增删改操作）
	 */
	@ApiListField("material_list")
	@ApiField("material_modify_info")
	private List<MaterialModifyInfo> materialList;

	/**
	 * 前台类目名称
	 */
	@ApiField("name")
	private String name;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public List<MaterialModifyInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialModifyInfo> materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
