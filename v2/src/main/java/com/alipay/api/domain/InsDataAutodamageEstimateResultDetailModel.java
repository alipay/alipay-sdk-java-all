package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图像定损结果详情对象
 *
 * @author auto create
 * @since 1.0, 2017-03-16 09:53:51
 */
public class InsDataAutodamageEstimateResultDetailModel extends AlipayObject {

	private static final long serialVersionUID = 6613859859663968612L;

	/**
	 * 受损程度
	 */
	@ApiField("damage_degree")
	private String damageDegree;

	/**
	 * 受损程度中文描述
	 */
	@ApiField("damage_degree_desc")
	private String damageDegreeDesc;

	/**
	 * 受损类型
	 */
	@ApiField("damage_type")
	private String damageType;

	/**
	 * 受损类型中文描述
	 */
	@ApiField("damage_type_desc")
	private String damageTypeDesc;

	/**
	 * 工时费，单位：元
	 */
	@ApiField("hourly_wage")
	private String hourlyWage;

	/**
	 * 是否旧件回收
	 */
	@ApiField("old_recycle")
	private Boolean oldRecycle;

	/**
	 * 保险公司原始图片名称列表，用逗号分隔
	 */
	@ApiField("origin_images")
	private String originImages;

	/**
	 * 配件费用，单位：元
	 */
	@ApiField("parts_cost")
	private String partsCost;

	/**
	 * 配件id
	 */
	@ApiField("parts_id")
	private String partsId;

	/**
	 * 零件管理费，单位：元
	 */
	@ApiField("parts_manage_fee")
	private String partsManageFee;

	/**
	 * 配件名称
	 */
	@ApiField("parts_name")
	private String partsName;

	/**
	 * 残值扣除，单位：元
	 */
	@ApiField("remain_value")
	private String remainValue;

	/**
	 * 维修方案
	 */
	@ApiField("repair_type")
	private String repairType;

	/**
	 * 维修方案中文描述
	 */
	@ApiField("repair_type_desc")
	private String repairTypeDesc;

	public String getDamageDegree() {
		return this.damageDegree;
	}
	public void setDamageDegree(String damageDegree) {
		this.damageDegree = damageDegree;
	}

	public String getDamageDegreeDesc() {
		return this.damageDegreeDesc;
	}
	public void setDamageDegreeDesc(String damageDegreeDesc) {
		this.damageDegreeDesc = damageDegreeDesc;
	}

	public String getDamageType() {
		return this.damageType;
	}
	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

	public String getDamageTypeDesc() {
		return this.damageTypeDesc;
	}
	public void setDamageTypeDesc(String damageTypeDesc) {
		this.damageTypeDesc = damageTypeDesc;
	}

	public String getHourlyWage() {
		return this.hourlyWage;
	}
	public void setHourlyWage(String hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public Boolean getOldRecycle() {
		return this.oldRecycle;
	}
	public void setOldRecycle(Boolean oldRecycle) {
		this.oldRecycle = oldRecycle;
	}

	public String getOriginImages() {
		return this.originImages;
	}
	public void setOriginImages(String originImages) {
		this.originImages = originImages;
	}

	public String getPartsCost() {
		return this.partsCost;
	}
	public void setPartsCost(String partsCost) {
		this.partsCost = partsCost;
	}

	public String getPartsId() {
		return this.partsId;
	}
	public void setPartsId(String partsId) {
		this.partsId = partsId;
	}

	public String getPartsManageFee() {
		return this.partsManageFee;
	}
	public void setPartsManageFee(String partsManageFee) {
		this.partsManageFee = partsManageFee;
	}

	public String getPartsName() {
		return this.partsName;
	}
	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}

	public String getRemainValue() {
		return this.remainValue;
	}
	public void setRemainValue(String remainValue) {
		this.remainValue = remainValue;
	}

	public String getRepairType() {
		return this.repairType;
	}
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	public String getRepairTypeDesc() {
		return this.repairTypeDesc;
	}
	public void setRepairTypeDesc(String repairTypeDesc) {
		this.repairTypeDesc = repairTypeDesc;
	}

}
