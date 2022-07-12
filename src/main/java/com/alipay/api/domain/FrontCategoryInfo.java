package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 前台类目数据模型
 *
 * @author auto create
 * @since 1.0, 2019-09-06 10:28:00
 */
public class FrontCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 1742682489391945715L;

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
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 素材列表
	 */
	@ApiListField("material_list")
	@ApiField("material_info")
	private List<MaterialInfo> materialList;

	/**
	 * 前台类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品归属主体ID
例：商品归属主体类型为店铺，则商品归属主体ID为店铺ID；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型:
5（店铺）
	 */
	@ApiField("target_type")
	private String targetType;

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

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<MaterialInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialInfo> materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
