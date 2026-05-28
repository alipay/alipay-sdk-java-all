package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 整机供应商关联的核心原材料信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:32:12
 */
public class SupplierCoreMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 8392692867529786518L;

	/**
	 * 核心原材料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 核心原材料名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 备料周期，单位天
	 */
	@ApiField("produce_period")
	private Long producePeriod;

	/**
	 * 关联的物料ID列表
	 */
	@ApiListField("relation_item_list")
	@ApiField("core_material_item_relation")
	private List<CoreMaterialItemRelation> relationItemList;

	/**
	 * 规格
	 */
	@ApiField("specs")
	private String specs;

	/**
	 * 子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getProducePeriod() {
		return this.producePeriod;
	}
	public void setProducePeriod(Long producePeriod) {
		this.producePeriod = producePeriod;
	}

	public List<CoreMaterialItemRelation> getRelationItemList() {
		return this.relationItemList;
	}
	public void setRelationItemList(List<CoreMaterialItemRelation> relationItemList) {
		this.relationItemList = relationItemList;
	}

	public String getSpecs() {
		return this.specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
