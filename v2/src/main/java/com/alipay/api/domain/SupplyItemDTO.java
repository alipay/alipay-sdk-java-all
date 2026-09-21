package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-02 14:52:48
 */
public class SupplyItemDTO extends AlipayObject {

	private static final long serialVersionUID = 1474797869714177388L;

	/**
	 * 是否为兜底供给
	 */
	@ApiField("default_supply")
	private Boolean defaultSupply;

	/**
	 * 供给实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 投放计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 样式类型
	 */
	@ApiField("style_type")
	private String styleType;

	/**
	 * 供给ID
	 */
	@ApiField("supply_id")
	private String supplyId;

	/**
	 * 供给名称
	 */
	@ApiField("supply_name")
	private String supplyName;

	/**
	 * 供给类型
	 */
	@ApiField("supply_type")
	private String supplyType;

	public Boolean getDefaultSupply() {
		return this.defaultSupply;
	}
	public void setDefaultSupply(Boolean defaultSupply) {
		this.defaultSupply = defaultSupply;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStyleType() {
		return this.styleType;
	}
	public void setStyleType(String styleType) {
		this.styleType = styleType;
	}

	public String getSupplyId() {
		return this.supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}

	public String getSupplyName() {
		return this.supplyName;
	}
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public String getSupplyType() {
		return this.supplyType;
	}
	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}

}
